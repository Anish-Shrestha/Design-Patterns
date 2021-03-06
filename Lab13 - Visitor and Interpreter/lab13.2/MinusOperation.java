package lab13_2;

public class MinusOperation extends Expression {
	Expression leftValue;
	Expression rightValue;

	public MinusOperation(Expression left, Expression right) {
		leftValue = left;
		rightValue = right;
	}

	public int interpret() {
		return leftValue.interpret() - rightValue.interpret();
	}

}
