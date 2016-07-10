package lab12_1;

public class Board {
	public static int ROW = 8;
	public static int COLUMN = 8;
	public Cell[][] cells;

	public Board() {
		initializeBoard();
	}

	//Set value of cell
	public void setCellValue(int rowNum, int columnNum, Cell value) {
		cells[rowNum][columnNum] = value;
	}

	//Get value of cell
	public Cell getCellValue(int rowNum, int columnNum) {
		return cells[rowNum][columnNum];
	}

	private void initializeBoard() {
		cells = new Cell[ROW][COLUMN];
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				cells[i][j] = Cell.NONE;
			}
		}

		// Initial data
		cells[3][3] = Cell.BLACK;
		cells[3][4] = Cell.WHITE;
		cells[4][3] = Cell.WHITE;
		cells[4][4] = Cell.BLACK;
	}

}