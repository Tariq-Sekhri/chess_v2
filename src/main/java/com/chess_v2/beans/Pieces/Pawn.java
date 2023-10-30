/*
TODO
 add captures
 fix change y by +1 to +/- depending on white or black


 */
package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Vector2;

import java.util.ArrayList;

public class Pawn extends Piece {
     Pawn (Vector2 location, Color color){
        this.setLocation(location);
        this.setColor(color);
        this.setPiece(ChessPieces.Pawn);
    }

    private boolean isFirstMove = true;

    @Override
    public void move(Vector2 location) {
        if(this.getPossibleMoves().contains(location)){
            this.setLocation(location);
        }
        if(isFirstMove){
            this.isFirstMove=false;
        }
    }

    @Override
    public ArrayList<Vector2> showPossibleMoves(Piece[][] board) {
        this.clearPossibleMoves();
        Piece temp = board[this.getLocation().getX()][this.getLocation().getY() + 1];
        if (temp == null) {
            this.addPossibleMove(new Vector2(this.getLocation()));
        }
        return this.getPossibleMoves();
    }
}
