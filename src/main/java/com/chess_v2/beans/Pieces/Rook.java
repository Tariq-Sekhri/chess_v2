package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Vector2;

import java.util.ArrayList;

public class Rook extends Piece{

   public Rook (Vector2 location, Color color){
        this.setLocation(location);
        this.setColor(color);
        this.setPiece(ChessPieces.Rook);
    }
    @Override
    public ArrayList<Vector2> showPossibleMoves(Piece[][] board) {
        return null;
    }
}
