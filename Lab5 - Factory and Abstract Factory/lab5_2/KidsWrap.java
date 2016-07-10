package Lesson5.AbstractFactoryMethod;

public class KidsWrap extends AbstractWrap {

	
	@Override
	public String packagingInstruction() {
		return "Happy Kid";
	}

	
	@Override
	public String packagingCost() {
		return "$0.10";
	}

}
