package lab4_1;

public class ConcreteSymmetryPrinter extends SymmetryPrinter {

	@Override
	public String[][] constructSymmetry(String[][] input, SymmetryType symmetryType) {
		if (symmetryType.equals(SymmetryType.VERTICAL))
			return getVerticalSymmetry(input);
		else if (symmetryType.equals(SymmetryType.HORIZONTAL))
			return getHorizontalSymmetry(input);
		else
			return getNormalSymmetry(input);
	}

	private String[][] getVerticalSymmetry(String[][] input) {
		System.out.println("\nVERTICAL SYMMETRY");
		String output[][] = new String[20][10];
		for (int i = 0; i < output.length; i++) {
			if (input.length > i) {
				for (int j = 0; j < output[0].length; j++) {
					if (input[0].length > j)
						output[i][j] = input[i][j];
					else
						output[i][j] = input[i][9 - j];
				}
			} else {
				for (int j = 0; j < output[0].length; j++) {
					output[i][j] = "-";
				}
			}
		}
		return output;
	}

	private String[][] getHorizontalSymmetry(String[][] input) {
		System.out.println("\nHORIZONTAL SYMMETRY");
		String output[][] = new String[20][10];
		for (int i = 0; i < output.length; i++) {
			if (input.length > i) {
				for (int j = 0; j < output[0].length; j++) {
					if (input[0].length > j)
						output[i][j] = input[i][j];
					else
						output[i][j] = "-";
				}
			} else if (2 * input.length > i) {
				for (int j = 0; j < output[0].length; j++) {
					if (input[0].length > j)
						output[i][j] = input[15 - i][j];
					else
						output[i][j] = "-";
				}
			} else {
				for (int j = 0; j < output[0].length; j++) {
					output[i][j] = "-";
				}
			}
		}
		return output;
	}

	private String[][] getNormalSymmetry(String[][] input) {
		System.out.println("\nNORMAL SYMMETRY");
		String output[][] = new String[20][10];
		for (int i = 0; i < output.length; i++) {
			if (input.length > i) {
				for (int j = 0; j < output[0].length; j++) {
					if (input[0].length > j) {
						output[i][j] = input[i][j];
					} else {
						output[i][j] = "-";
					}
				}
			} else {
				for (int j = 0; j < output[0].length; j++) {
					output[i][j] = "-";
				}
			}
		}
		return output;
	}

}
