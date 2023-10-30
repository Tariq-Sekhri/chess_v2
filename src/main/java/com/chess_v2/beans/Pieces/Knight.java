/*
* TODO
*
* */

package com.chess_v2.beans.Pieces;


import com.chess_v2.beans.utils.Vector2;

import java.util.ArrayList;

public class Knight extends Piece {

    @Override
    public void move(Vector2 location) {
        this.setLocation(location);


    }

    @Override
    public ArrayList<Vector2> showPossibleMoves(Piece[][] board) {


        return this.getPossibleMoves();
    }
}
