package lab4_2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1908697867957675321L;

	private int id;
	private String lastname;
	private String firstname;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private Employee supervisor;
	private Employee staff[];

	public Employee() {

	}

	public Employee(int id, String lastname, String firstname, String streetAddress, String city, String state,
			String zipcode, Employee supervisor, Employee[] staff) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.supervisor = supervisor;
		this.staff = staff;
	}

	public Employee(Employee employee) {
		super();
		this.id = employee.id;
		this.lastname = employee.lastname;
		this.firstname = employee.firstname;
		this.streetAddress = employee.streetAddress;
		this.city = employee.city;
		this.state = employee.state;
		this.zipcode = employee.zipcode;
		this.supervisor = employee.supervisor;
		this.staff = employee.staff;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public Employee[] getStaff() {
		return staff;
	}

	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}

	@Override
	protected Object clone() {
		Object employee;
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream;
		try {
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(this);
			objectOutputStream.flush();
			objectOutputStream.close();
			byteArrayOutputStream.close();
			byte[] byteData = byteArrayOutputStream.toByteArray();

			// Restore your class from a stream of bytes:
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteData);
			employee = new ObjectInputStream(byteArrayInputStream).readObject();
			return employee;			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		String printData = "\n\nEmployee [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", supervisor=" + getSupervisorDetails(supervisor) + "]";
		if (staff != null) {
			printData += "\n ---------Staffs----------\n";
			for (Employee employee : staff) {
				printData += employee.toString();
			}
		}
		return printData;
	}

	public String getSupervisorDetails(Employee employee) {
		String supervisorData = "";
		if (employee != null) {
			supervisorData += "Employee [id=" + employee.id + ", lastname=" + employee.lastname + ", firstname="
					+ employee.firstname + ", streetAddress=" + employee.streetAddress + ", city=" + employee.city
					+ ", state=" + employee.state + ", zipcode=" + employee.zipcode + ", supervisor="
					+ getSupervisorDetails(employee.getSupervisor()) + "]";
		}
		return supervisorData;
	}

}
