package chess;

import boardgame.Position;
import exceptions.ChessException;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Values must be between a1 and h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        int rowPosition = 8 - row;
        int columnPosition = column - 'a';
        return new Position(rowPosition, columnPosition);
    }

    protected static ChessPosition toChessPosition(Position position) {
        int rowPosition = 8 - position.getRow();
        char columnPosition = (char) ('a' - position.getColumn());
        return new ChessPosition(columnPosition, rowPosition);
    }

    @Override
    public String toString() {
        return String.format("%s%d", column, row);
    }
}
