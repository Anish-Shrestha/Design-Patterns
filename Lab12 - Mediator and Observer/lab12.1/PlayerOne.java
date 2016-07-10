package lab12_1;

public class PlayerOne extends Player {

	public PlayerOne(Mediator mediator) {
		super(mediator);
		color = Cell.BLACK;
	}

	@Override
	public void move(int row, int column) {
		mediator.move(this, row, column);
	}

}
