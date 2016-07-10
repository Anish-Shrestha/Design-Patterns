package Lesson8.Flyweight;

public class ConcreteCustomer implements CustomerLogger {
	
	public ConcreteCustomer(City city) {
		new Image(city);
	}

	@Override
	public void logCustomerInfo(String cutomerId, String firstName, String lastName) {
		System.out.println(
				"Cutomer details::cutomerId" + cutomerId + " firstName::" + firstName + " lastName::" + lastName);

	}
}