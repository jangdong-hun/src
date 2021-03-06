/*    y
 * x 00
 *
 *         88
 * */
public class Pawn extends ChessPieces {
	public Pawn(Position curPosition, char color) {
		this.curPosition = curPosition;
		this.color = color;
		this.isAlive = true;
	}

	public boolean first = true;

	public ChessBoardCell[] isMovable(Position curPosition, ChessBoardCell[][] cells, char color) {// 능력의 한계로 폰이 한 번에 가질
																									// 수 있는 최대의 경우의 수
																									// 4개의 cells의 배열을 반환
																									// 2개면 cells[2]부턴
																									// null
		int num = 0;
		ChessBoardCell[] availCells = new ChessBoardCell[4];

		if (color == 'B') {// Black
			if (curPosition.x == 7) {
				return null;
			} else {
				if (first) {

					first = false;
					if ((cells[curPosition.x + 1][curPosition.y].piece == null)
							|| (cells[curPosition.x + 1][curPosition.y].piece.color == 'W')) {
						availCells[num] = cells[curPosition.x + 1][curPosition.y];
						num++;
						if ((cells[curPosition.x + 2][curPosition.y].piece == null)
								|| (cells[curPosition.x + 2][curPosition.y].piece.color == 'W')) {
							availCells[num] = cells[curPosition.x + 2][curPosition.y];
							num++;
						}
					}
					if (cells[curPosition.x + 1][curPosition.y + 1].piece.color == 'W') {
						availCells[num] = cells[curPosition.x + 1][curPosition.y + 1];
						num++;
					}
					if (cells[curPosition.x + 1][curPosition.y - 1].piece.color == 'W') {
						availCells[num] = cells[curPosition.x + 1][curPosition.y - 1];
						num++;
					}
				} else {
					if ((cells[curPosition.x + 1][curPosition.y].piece == null)
							|| (cells[curPosition.x + 1][curPosition.y].piece.color == 'W')) {
						availCells[num] = cells[curPosition.x + 1][curPosition.y];
						num++;
					}
					if (cells[curPosition.x + 1][curPosition.y + 1].piece.color == 'W') {
						availCells[num] = cells[curPosition.x + 1][curPosition.y + 1];
						num++;
					}
					if (cells[curPosition.x + 1][curPosition.y - 1].piece.color == 'W') {
						availCells[num] = cells[curPosition.x + 1][curPosition.y - 1];
						num++;
					}
				}
			}
		} else {// White
			if (curPosition.x == 0) {
				return null;
			} else {
				if (first) {
					first = false;
					if ((cells[curPosition.x - 1][curPosition.y].piece == null)
							|| (cells[curPosition.x - 1][curPosition.y].piece.color == 'W')) {
						availCells[num] = cells[curPosition.x - 1][curPosition.y];
						num++;
						if ((cells[curPosition.x - 2][curPosition.y].piece == null)
								|| (cells[curPosition.x - 2][curPosition.y].piece.color == 'W')) {
							availCells[num] = cells[curPosition.x - 2][curPosition.y];
							num++;
						}
					}
					if (cells[curPosition.x - 1][curPosition.y - 1].piece.color == 'W') {
						availCells[num] = cells[curPosition.x - 1][curPosition.y - 1];
						num++;
					}
					if (cells[curPosition.x - 1][curPosition.y + 1].piece.color == 'W') {
						availCells[num] = cells[curPosition.x - 1][curPosition.y + 1];
						num++;
					}
				} else {
					if ((cells[curPosition.x - 1][curPosition.y].piece == null)
							|| (cells[curPosition.x - 1][curPosition.y].piece.color == 'W')) {
						availCells[num] = cells[curPosition.x - 1][curPosition.y];
						num++;
					}
					if (cells[curPosition.x - 1][curPosition.y - 1].piece.color == 'W') {
						availCells[num] = cells[curPosition.x - 1][curPosition.y - 1];
						num++;
					}
					if (cells[curPosition.x - 1][curPosition.y + 1].piece.color == 'W') {
						availCells[num] = cells[curPosition.x - 1][curPosition.y + 1];
						num++;
					}
				}
			}
			return availCells;
		}
	}

}
