/*
* TODO
*
* */

package com.chess_v2.beans.Pieces;


import com.chess_v2.beans.utils.Location;

import java.util.ArrayList;

public class Knight extends Piece {

    @Override
    public void move(Location location) {
        this.setLocation(location);


    }

    @Override
    public ArrayList<Location> showPossibleMoves(Piece[][] board) {


        return this.getPossibleMoves();
    }
}
