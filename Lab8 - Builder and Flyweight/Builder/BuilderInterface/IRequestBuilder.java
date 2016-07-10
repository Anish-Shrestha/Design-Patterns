package Lesson8.Builder.BuilderInterface;

import java.util.List;

import com.prajay.Lesson8.Builder.Agent;
import com.prajay.Lesson8.Builder.Customer;

public interface IRequestBuilder {
	
	public void initRequest(Agent agent);

	public boolean loadUserProfile(String phone, List<Customer> customers);

	public void createCustomer(String name, String phone);

	public void createRequestContent(String requestContent);

	public void createReponseContent(String responseContent);

	public void saveRequest(boolean isAnswered, boolean needCallBack);

}
