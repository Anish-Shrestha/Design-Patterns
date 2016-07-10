package Lesson5.AbstractFactoryMethod;

public class Client {
	private GiftFactory factory;

	public Client(String user) {
		if (user.equals("kids"))
			factory = new KidsGiftFactory();
		else if (user.equals("business"))
			factory = new BusinessGiftFactory();
		else
			factory = new AdultsGiftFactory();
	}

	public GiftFactory getFactory() {
		return factory;
	}

	public static void main(String[] args) {

		Client client = new Client("kids");
		GiftFactory factory = client.getFactory();
		
		AbstractBag bag = factory.createBag();
		System.out.println(bag.packagingInstruction() + " having Cost: " + bag.packagingCost());
		
		AbstractBox box = factory.createBox();
		System.out.println(box.packagingInstruction() + " having Cost: " + box.packagingCost());
		
		AbstractWrap wrap = factory.createWrap();
		System.out.println(wrap.packagingInstruction() + " having Cost: " + wrap.packagingCost());
	}
}
