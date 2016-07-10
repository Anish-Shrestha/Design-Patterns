package composite;

import java.util.ArrayList;
import java.util.Collection;

public abstract class GUIContainer {
	protected Collection<GUIContainer> list = new ArrayList<GUIContainer>();
	protected String title;

	public abstract void print();

	public void addContainer(GUIContainer item) {
		list.add(item);
	}
}
