package lab13_2;

public class Number extends Expression {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public int interpret() {
		return number;
	}

}
