package lab12_1;

public class PlayerTwo extends Player {

	public PlayerTwo(Mediator mediator) {
		super(mediator);
		color = Cell.WHITE;
	}

	@Override
	public void move(int row, int column) {
		mediator.move(this, row, column);
	}

}
