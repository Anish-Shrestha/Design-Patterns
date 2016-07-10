package lab6_2;

import java.util.ArrayList;
import java.util.List;

public class Element extends Entity {
	private List<Entity> children = new ArrayList<>();
	private String value;

	public Element(String val) {
		value = val;
	}

	public void add(Entity c) {
		children.add(c);
	}

	public void traverse() {
		System.out.println(indent.toString() + value);
		indent.append("   ");
		for (int i = 0; i < children.size(); i++)
			((Entity) children.get(i)).traverse();
		indent.setLength(indent.length() - 3);
	}
}