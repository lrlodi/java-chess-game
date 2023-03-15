package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;
    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] match = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                match[i][j] = (ChessPiece) board.getPiece(i, j);            }
        }
        return match;
    }

    private void placeNewPiece(ChessPiece piece, char column, int row) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece(new Rook(board, Color.BLACK), 'a', 1);
        placeNewPiece(new Rook(board, Color.BLACK), 'h', 1);
        placeNewPiece(new Rook(board, Color.WHITE), 'a', 8);
        placeNewPiece(new Rook(board, Color.WHITE), 'h', 8);
        placeNewPiece(new King(board, Color.BLACK), 'd', 1);
        placeNewPiece(new King(board, Color.WHITE), 'e', 8);
    }
}
