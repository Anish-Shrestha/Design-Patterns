package lab13_1;

public class Client {

	public static void main(String[] args) {
		Root root = ComposeDataTree.getRoot();
		SimpleNodeVisitor visitor = new SimpleNodeVisitor();
		root.accept(visitor);
	}
}
