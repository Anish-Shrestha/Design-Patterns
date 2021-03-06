package lab12_1;

public interface Mediator {
	public void move(Player player, int rowNum, int colNum);

	public boolean isValidMove(Player player, int rowNum, int colNum);

	public boolean isGameOver();

	public Board getBoard();
}
