package lab6_1;

public class Client {
	public static void main(String[] args) {

		NameRepository repository = new NameRepository();
		Iterator iterator = repository.getIterator(new MyPredicate());

		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
			
		}
	}
}
