package Lesson5.AbstractFactoryMethod;

public class KidsGiftFactory implements GiftFactory {

	
	@Override
	public AbstractBag createBag() {
		return new KidsBag();
	}

	
	@Override
	public AbstractBox createBox() {
		return new KidsBox();
	}

	@Override
	public AbstractWrap createWrap() {
		return new KidsWrap();
	}

}
