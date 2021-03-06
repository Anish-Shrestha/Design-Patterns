package lab4_1;

public class Client {
	public static void main(String[] args) {
		String charA[][] = new String[][] { { "-", "-", "-", "-", "-" }, { "-", "-", "-", "-", "+" },
				{ "-", "-", "-", "+", "+" }, { "-", "-", "+", "+", "-" }, { "-", "-", "+", "+", "-" },
				{ "-", "+", "+", "-", "-" }, { "-", "+", "+", "-", "-" }, { "-", "+", "+", "-", "-" },
				{ "-", "+", "+", "+", "+" }, { "-", "+", "+", "-", "-" }, { "-", "+", "+", "-", "-" },
				{ "-", "+", "+", "-", "-" }, { "-", "+", "+", "-", "-" }, { "-", "+", "+", "-", "-" } };

		String charB[][] = new String[][] { { "-", "-", "-", "-", "-", "-", "-", "-", "-" },
				{ "-", "+", "+", "+", "+", "+", "-", "-", "-" }, { "-", "+", "+", "-", "-", "+", "+", "-", "-" },
				{ "-", "+", "+", "-", "-", "-", "+", "+", "-" }, { "-", "+", "+", "-", "-", "-", "+", "+", "-" },
				{ "-", "+", "+", "-", "-", "-", "+", "+", "-" }, { "-", "+", "+", "-", "-", "+", "+", "-", "-" },
				{ "-", "+", "+", "+", "+", "+", "+", "-", "-" }, { "-", "+", "+", "-", "-", "-", "+", "+", "-" },
				{ "-", "+", "+", "-", "-", "-", "-", "+", "+" }, { "-", "+", "+", "-", "-", "-", "-", "+", "+" },
				{ "-", "+", "+", "-", "-", "-", "-", "+", "+" }, { "-", "+", "+", "-", "-", "-", "+", "+", "-" },
				{ "-", "+", "+", "+", "+", "+", "+", "-", "-" } };

		String charC[][] = new String[][] { { "-", "-", "-", "-", "-", "-", "-", "-", "-" },
				{ "-", "-", "-", "+", "+", "+", "+", "-", "-" }, { "-", "-", "+", "+", "-", "-", "+", "+", "-" },
				{ "-", "+", "+", "-", "-", "-", "-", "+", "+" }, { "-", "+", "+", "-", "-", "-", "-", "-", "-" },
				{ "-", "+", "+", "-", "-", "-", "-", "-", "-" }, { "-", "+", "+", "-", "-", "-", "-", "-", "-" },
				{ "-", "+", "+", "-", "-", "-", "-", "-", "-" } };
		SymmetryPrinter symmetryPrinter = new ConcreteSymmetryPrinter();

		symmetryPrinter.buildSymmetry(charA);
		symmetryPrinter.buildSymmetry(charB);
		symmetryPrinter.buildSymmetry(charC);

	}
}
