package lab13_2;

public class PlusOperation extends Expression {
	Expression leftValue;
	Expression rightValue;

	public PlusOperation(Expression left, Expression right) {
		leftValue = left;
		rightValue = right;
	}

	public int interpret() {
		return leftValue.interpret() + rightValue.interpret();
	}

}
