package Lesson5.AbstractFactoryMethod;

public class AdultsBag extends AbstractBag {

	
	@Override
	public String packagingInstruction() {
		return "Reusable Shopper";
	}

	
	@Override
	public String packagingCost() {
		return "$0.00";
	}

}
