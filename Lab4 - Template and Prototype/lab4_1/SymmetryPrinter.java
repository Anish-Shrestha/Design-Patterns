package lab4_1;

public abstract class SymmetryPrinter {
	public final void buildSymmetry(String[][] input) {
		SymmetryType symmetryType = getSymmetryType(input);
		String[][] output = constructSymmetry(input, symmetryType);
		print(output);
	}

	public abstract String[][] constructSymmetry(String[][] input, SymmetryType symmetryType);

	private SymmetryType getSymmetryType(String[][] output) {
		if (output[0].length == 5 && output.length == 14)
			return SymmetryType.VERTICAL;
		else if (output[0].length == 9 && output.length == 8)
			return SymmetryType.HORIZONTAL;
		return SymmetryType.NORMAL;
	}

	private void print(String[][] output) {
		System.out.println("======================================");
		
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[0].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}