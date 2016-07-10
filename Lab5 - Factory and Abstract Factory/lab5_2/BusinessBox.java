package Lesson5.AbstractFactoryMethod;

public class BusinessBox extends AbstractBox {


	@Override
	public String packagingInstruction() {
		// TODO Auto-generated method stub
		return "Hard Plastic";
	}

	
	@Override
	public String packagingCost() {
		// TODO Auto-generated method stub
		return "$1.00";
	}

}
