package boardgame;

public class Board {
    private int rows;
    private int columns;
    private boardgame.Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new boardgame.Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public boardgame.Piece getPiece(int x, int y) {
        return this.pieces[x][y];
    }
}
