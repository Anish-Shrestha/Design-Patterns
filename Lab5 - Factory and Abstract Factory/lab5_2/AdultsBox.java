package Lesson5.AbstractFactoryMethod;
public class AdultsBox extends AbstractBox {

	
	@Override
	public String packagingInstruction() {
		return "Plain Paper";
	}

	
	@Override
	public String packagingCost() {
		return "$0.25";
	}

}
