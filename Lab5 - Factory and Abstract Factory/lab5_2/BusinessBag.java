package Lesson5.AbstractFactoryMethod;

public class BusinessBag extends AbstractBag {

	
	@Override
	public String packagingInstruction() {
		return "Merchant Collection";
	}

	
	@Override
	public String packagingCost() {
		return "$0.50";
	}

}
