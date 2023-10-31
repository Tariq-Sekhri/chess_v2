package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;
import javafx.geometry.Rectangle2D;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Queen extends Piece {

    public Queen(Location location, Color color)  throws FileNotFoundException{

            super(location, color, ChessPieces.Queen);

        if (color == Color.Black) {
            getImageVeiw().setViewport(new Rectangle2D(185, 20, 96, 96));
        }else{
            getImageVeiw().setViewport(new Rectangle2D(185, 120, 96, 96));
        }

    }

    @Override
    public ArrayList<Location> showPossibleMoves(Piece[][] board) {
        return null;
    }
}
