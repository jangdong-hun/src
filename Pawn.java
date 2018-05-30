/*    y
 * x 00
 *
 *         88
 * */
public class Pawn extends ChessPieces {
	public Pawn(Position curPosition, char color) {
		this.curPosition = curPosition;
		this.color = color;
	}

	public boolean first = true;

	public ChessBoardCell[] isMovable(Position curPosition, ChessBoardCell[][] cells, char color) {//�ɷ��� �Ѱ�� ���� �� ���� ���� �� �ִ� �ִ��� ����� �� 4���� cells�� �迭�� ��ȯ 2���� cells[2]���� null
		                                                                                           //������ �غ��� 8X8�� ����� ������ ���ߴ� ������������������  
		int num=0;
		ChessBoardCell[] availCells = new ChessBoardCell[4];
		if (color == 'B') {// Black
			if (first) {
				first=false;
				if ((cells[curPosition.x + 1][curPosition.y].piece == null)||(cells[curPosition.x + 1][curPosition.y].piece.color=='W')) {
					availCells[num]=cells[curPosition.x + 1][curPosition.y];
					num++;
					if((cells[curPosition.x + 2][curPosition.y].piece == null)||(cells[curPosition.x + 2][curPosition.y].piece.color=='W')) {
						availCells[num]=cells[curPosition.x + 2][curPosition.y];
					    num++;
					}
				}
				if(cells[curPosition.x + 1][curPosition.y + 1].piece.color=='W') {
					availCells[num]=cells[curPosition.x + 1][curPosition.y + 1];
					num++; 
				}
				if(cells[curPosition.x + 1][curPosition.y - 1].piece.color=='W') {
					availCells[num]=cells[curPosition.x + 1][curPosition.y - 1];
					num++;
				}
			}
			else {
				if ((cells[curPosition.x + 1][curPosition.y].piece == null)||(cells[curPosition.x + 1][curPosition.y].piece.color=='W')) { 
					availCells[num]=cells[curPosition.x + 1][curPosition.y];
					num++;
				}
				if(cells[curPosition.x + 1][curPosition.y + 1].piece.color=='W') {
					availCells[num]=cells[curPosition.x + 1][curPosition.y + 1];
					num++;
				}
				if(cells[curPosition.x + 1][curPosition.y - 1].piece.color=='W') {
					availCells[num]=cells[curPosition.x + 1][curPosition.y - 1];
					num++;
				}
			}
		}
		else {//White
			if (first) {
				first=false;
				if ((cells[curPosition.x - 1][curPosition.y].piece == null)||(cells[curPosition.x - 1][curPosition.y].piece.color=='W')) {
					availCells[num]=cells[curPosition.x - 1][curPosition.y];
					num++;
					if((cells[curPosition.x - 2][curPosition.y].piece == null)||(cells[curPosition.x - 2][curPosition.y].piece.color=='W')) {
						availCells[num]=cells[curPosition.x - 2][curPosition.y];
					    num++;
					}
				}
				if(cells[curPosition.x - 1][curPosition.y - 1].piece.color=='W') {
					availCells[num]=cells[curPosition.x - 1][curPosition.y - 1];
					num++; 
				}
				if(cells[curPosition.x - 1][curPosition.y + 1].piece.color=='W') {
					availCells[num]=cells[curPosition.x - 1][curPosition.y + 1];
					num++;
				}
			}
			else {
				if ((cells[curPosition.x - 1][curPosition.y].piece == null)||(cells[curPosition.x - 1][curPosition.y].piece.color=='W')) { 
					availCells[num]=cells[curPosition.x - 1][curPosition.y];
					num++;
				}
				if(cells[curPosition.x - 1][curPosition.y - 1].piece.color=='W') {
					availCells[num]=cells[curPosition.x - 1][curPosition.y - 1];
					num++;
				}
				if(cells[curPosition.x - 1][curPosition.y + 1].piece.color=='W') {
					availCells[num]=cells[curPosition.x - 1][curPosition.y + 1];
					num++;
				}
			}	
		}
		return availCells;
    }

}
