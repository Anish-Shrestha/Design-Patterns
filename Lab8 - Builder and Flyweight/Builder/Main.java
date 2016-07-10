package Lesson8.Builder;

import java.util.Arrays;
import java.util.List;

import com.prajay.Lesson8.Builder.Director.RequestDirector;


public class Main {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Anish Man Shrestha", "641-451-3303");
		Customer customer2 = new Customer("Jivan", "641-451-3304");
		
		List<Customer> customers = Arrays.asList(customer1, customer2);
		Agent agent = new Agent("1", new Address("1000 N 4th Street", "Fairfield", "IA", "52557"));

		// Director 
		RequestDirector director = new RequestDirector();
		
		director.initRequest(agent);
		director.buildRequest(customers, "641-451-3303", "Anish Man Shrestha", "Request", "Response");
		director.saveRequest(true, false);
		
		director.initRequest(agent);
		director.buildRequest(customers, "641-451-3304", "Jiavn", "Request", "Response");
		director.saveRequest(true, false);
		
		

	}
}