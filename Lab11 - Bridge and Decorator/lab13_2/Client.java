package lab13_2;

public class Client {

	public static void main(String[] args) {
		System.out.println("===========ArrayListProfiler==========");
		ListDecorator listDecorator = new TimeProfiler(new ArrayListProfiler());
		listDecorator.add("Apple");
		listDecorator.add("Ball");
		listDecorator.add("Cat");

		listDecorator.contains("Cat");
		System.out.println("Size:" + listDecorator.size());
		listDecorator.remove("Ball");

		
		System.out.println("\n\n===========LinkedListProfiler==========");
		listDecorator = new TimeProfiler(new LinkedListProfiler());
		listDecorator.add("Ant");
		listDecorator.contains("Ant");
		System.out.println("Size:" + listDecorator.size());
		listDecorator.remove("Ant");
	}

}