package Lesson5.AbstractFactoryMethod;

public class AdultsGiftFactory implements GiftFactory {

	@Override
	public AbstractBag createBag() {
		return new AdultsBag();
	}

	
	@Override
	public AbstractBox createBox() {
		return new AdultsBox();
	}

	
	@Override
	public AbstractWrap createWrap() {
		return new AdultsWrap();
	}

}
