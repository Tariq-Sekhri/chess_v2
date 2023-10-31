/*
TODO
 add captures
 fix change y by +1 to +/- depending on white or black


 */
package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Pawn extends Piece {
    private boolean isFirstMove = true;

    public Pawn(Location location, Color color)  throws FileNotFoundException {
        super(location, color, ChessPieces.Pawn);

    }

    @Override
    public void move(Location location) {
        if (this.getPossibleMoves().contains(location)) {
            this.setLocation(location);
        }
        if (isFirstMove) {
            this.isFirstMove = false;
        }
    }

    @Override
    public ArrayList<Location> showPossibleMoves(Piece[][] board) {
        this.clearPossibleMoves();
        Piece temp = board[this.getLocation().getX()][this.getLocation().getY() + 1];
        if (temp == null) {
            this.addPossibleMove(new Location(this.getLocation()));
        }
        return this.getPossibleMoves();
    }
}
