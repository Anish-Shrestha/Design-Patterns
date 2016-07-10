package lab6_2;

public class Node extends Entity {
	private String value;

	public Node(String val) {
		value = val;
	}

	public void traverse() {
		System.out.println(indent.toString() + value);
	}
}