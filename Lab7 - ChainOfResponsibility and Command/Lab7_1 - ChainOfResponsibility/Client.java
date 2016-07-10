package chainofrespexam;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private ChainBuilder chain;

	public Client() {
		chain = new ChainBuilder();
	}

	public void sendRequest(List<String> templateTypes) {
		chain.getHandler().handleRequest(templateTypes);
	}

	public static void main(String[] args) {
		List<String> templateTypes = new ArrayList<>();
		templateTypes.add("image");
		templateTypes.add("post");
		templateTypes.add("category");
		templateTypes.add("archive");
		templateTypes.add("frontpage");
		Client client = new Client();
		client.sendRequest(templateTypes);
	}
}