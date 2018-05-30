/*    y
 * x 00
 *
 *         88
 * */
public class Knight extends ChessPieces {
	public Knight(Position curPosition, char color) {
		this.curPosition = curPosition;
		this.color = color;
		this.isAlive=true;
	}
	public ChessBoardCell[] isMovable(Position curPosition, ChessBoardCell[][] cells, char color) {
		int num=0;
		ChessBoardCell[] availCells = new ChessBoardCell[8];
		if (color == 'B') {// Black
			if ((cells[curPosition.x + 2][curPosition.y - 1].piece == null)||(cells[curPosition.x + 1][curPosition.y].piece.color=='W'))
		}
	}
}