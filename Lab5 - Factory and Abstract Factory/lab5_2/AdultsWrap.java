package Lesson5.AbstractFactoryMethod;

public class AdultsWrap extends AbstractWrap {

	
	@Override
	public String packagingInstruction() {
		return "Everyday Value";
	}

	@Override
	public String packagingCost() {
		return "$0.00";
	}

}
