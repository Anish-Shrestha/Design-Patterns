package Lesson5.AbstractFactoryMethod;

public interface GiftFactory {
	public abstract AbstractBag createBag();
	public abstract AbstractBox createBox();
	public abstract AbstractWrap createWrap();
}
