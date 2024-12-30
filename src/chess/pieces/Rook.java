package chess.pieces;

import chess.ChessPiece;
import chess.ChessPiece;
import boardgame.Board;
import chess.Color;

public class Rook extends ChessPiece {
    public Rook (Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
