package Lesson5.AbstractFactoryMethod;

public class KidsBag extends AbstractBag {

	@Override
	public String packagingInstruction() {
		return "Micky";
	}

	@Override
	public String packagingCost() {
		return "$0.25";
	}

}
