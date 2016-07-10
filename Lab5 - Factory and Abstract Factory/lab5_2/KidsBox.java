package Lesson5.AbstractFactoryMethod;

public class KidsBox extends AbstractBox {

	
	@Override
	public String packagingInstruction() {
		return "Cartoon";
	}

	
	@Override
	public String packagingCost() {
		return "$0.50";
	}

}
