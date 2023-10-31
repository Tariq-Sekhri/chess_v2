package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Bishop extends Piece{
    public Bishop(Location location, Color color)  throws FileNotFoundException {
        super(location, color, ChessPieces.Bishop);

    }
    @Override
    public ArrayList<Location> showPossibleMoves(Piece[][] board) {
        return null;
    }
}
