package composite;

public class Container extends GUIContainer {
	public Container(String title) {
		super.title = title;
	}

	public void print() {
		System.out.println("Container name=" + title);
		for (GUIContainer container : list) {
			container.print();
		}
	}
}