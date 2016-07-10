package lab6_2;

public class Client {
	public static void main(String[] args) {
		Element root = initialize();
		root.traverse();
	}

	private static Element initialize() {
		Element[] elements = new Element[7];
		elements[0] = new Element("");
		elements[1] = new Element("<html>");
		for (int i = 0; i < 1; i++) {
			elements[2] = new Element("<head>");
			elements[2].add(new Element("<title>"));
			elements[2].add(new Element("</title>"));
			elements[1].add(elements[2]);
			elements[1].add(new Element("</head>"));
			elements[3] = new Element("<body>");
			elements[1].add(elements[3]);
			elements[1].add(new Element("</body>"));

			elements[4] = new Element("<header>");
			elements[5] = new Element("<section>");
			elements[6] = new Element("<footer>");
			int lev = 4;
			for (int j = 0; j < 3; j++) {
				elements[lev + j].add(new Node("<div>"));
				elements[lev + j].add(new Node("</div>"));
			}
			elements[3].add(elements[4]);
			elements[3].add(new Element("</header>"));
			elements[3].add(elements[5]);
			elements[3].add(new Element("</section>"));
			elements[3].add(elements[6]);
			elements[3].add(new Element("</footer>"));
		}
		elements[0].add(elements[1]);
		elements[0].add(new Element("</html>"));
		return elements[0];
	}
}