package Lesson8.Builder;

public class Customer {
	
	private String name;
	private String phone;

	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}
}
