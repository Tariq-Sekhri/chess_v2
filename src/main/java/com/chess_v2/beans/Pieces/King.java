package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;

import java.util.ArrayList;

public class King extends Piece{

    public King(Location location, Color color) {
        super(location, color, ChessPieces.King);

    }
    @Override
    public ArrayList<Location> showPossibleMoves(Piece[][] board) {
        return null;
    }
}
