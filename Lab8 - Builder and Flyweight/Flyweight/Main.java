package Lesson8.Flyweight;

public class Main {

	public static void main(String[] args) {
		
		ConcreteCustomer concreteCustomer = CustomerFactory.getCustomer(City.IowaCity);
		concreteCustomer.logCustomerInfo("1", "Prajay", "Mulmi");

		UnsharedCustomer unsharedCustomer = new UnsharedCustomer(City.IowaCity, "Mulmi");
		unsharedCustomer.logCustomerInfo("2", "Prajay", unsharedCustomer.getLastName());
	}

}
