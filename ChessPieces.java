abstract class ChessPieces {
	boolean isAlive;
	char color;
	Position curPosition = new Position();
	abstract ChessBoardCell[] isMovable(Position curPosition, ChessBoardCell[][] cells, char color);

}