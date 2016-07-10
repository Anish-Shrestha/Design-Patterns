package composite;

public class Widget extends GUIContainer {
	private String widgetType;

	public Widget(String number, String widgetType) {
		super.title = title;
		this.widgetType = widgetType;
	}

	// for addItem() method, print a message “cannot add child”
	public void print() {
		System.out.println("Widget [widgetType=" + widgetType + ", title=" + title + "]");
	}
}
