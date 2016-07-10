package Lesson5.AbstractFactoryMethod;

public class BusinessGiftFactory implements GiftFactory {

	
	@Override
	public AbstractBag createBag() {
		return new BusinessBag();
	}

	
	@Override
	public AbstractBox createBox() {
		return new BusinessBox();
	}

	@Override
	public AbstractWrap createWrap() {
		return new BusinessWrap();
	}

}
