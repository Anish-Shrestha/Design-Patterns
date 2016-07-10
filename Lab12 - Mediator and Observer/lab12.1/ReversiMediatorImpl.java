package lab12_1;

public class ReversiMediatorImpl implements Mediator {
	public Board board;
	public Player currentPlayer;

	public ReversiMediatorImpl() {
		board = new Board();
	}

	@Override
	public Board getBoard() {
		return board;
	}

	@Override
	public void move(Player player, int row, int column) {
		if (isValidMove(player, row, column)) {
			board.setCellValue(row, column, player.getColor());
			currentPlayer = player;
			if (isGameOver()) {
				System.out.println("Finish Game");
			}
		}
	}

	@Override
	public boolean isValidMove(Player player, int row, int column) {
		return true;  //or false;
	}

	@Override
	public boolean isGameOver() {
		return false; //or true;
	}
}
