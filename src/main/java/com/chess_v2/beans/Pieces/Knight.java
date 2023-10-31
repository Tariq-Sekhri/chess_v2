/*
* TODO
*
* */

package com.chess_v2.beans.Pieces;


import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;

import java.util.ArrayList;

public class Knight extends Piece {
    public Knight(Location location, Color color) {
        super(location, color, ChessPieces.Knight);

    }
    @Override
    public void move(Location location) {
        this.setLocation(location);


    }

    @Override
    public ArrayList<Location> showPossibleMoves(Piece[][] board) {


        return this.getPossibleMoves();
    }
}
