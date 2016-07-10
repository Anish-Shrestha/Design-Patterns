package Lesson5.AbstractFactoryMethod;

public class BusinessWrap extends AbstractWrap {

	
	@Override
	public String packagingInstruction() {
		return "Holiday Surprise";
	}

	
	@Override
	public String packagingCost() {
		return "$0.25";
	}

}
