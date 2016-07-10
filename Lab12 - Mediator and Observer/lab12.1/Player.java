package lab12_1;

public abstract class Player {
	protected Mediator mediator;
	public Cell color;

	public Player(Mediator mediator) {
		this.mediator = mediator;
	}

	public Cell getColor() {
		return color;
	}

	abstract void move(int row, int column);
}
