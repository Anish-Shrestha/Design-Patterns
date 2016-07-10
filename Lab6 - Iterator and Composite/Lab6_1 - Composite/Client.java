package composite;

public class Client {
	public static void main(String[] args) {
		GUIContainer window = new Container("Window");
		GUIContainer buttonWidget = new Widget("1", "ButtonWidget");
		GUIContainer paneContainer = new Container("PaneContainer");
		GUIContainer checkBoxWidget = new Widget("2", "CheckBoxWidget");
		paneContainer.addContainer(checkBoxWidget);
		window.addContainer(buttonWidget);
		window.addContainer(paneContainer);
		
		window.print();
	}
}