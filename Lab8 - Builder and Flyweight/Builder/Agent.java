package Lesson8.Builder;

public class Agent {
	
	private String agentId;
	private Address workAddress;

	public Agent(String agentId, Address address) {
		this.agentId = agentId;
		this.workAddress = address;
	}

	public String getId() {
		return agentId;
	}
	
	public Address getWorkAddress() {
		return workAddress;
	}
}