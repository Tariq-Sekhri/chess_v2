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
            getPieceAtlas().setViewport(new Rectangle2D(190, 22.5, 96, 96));
        }else{
            getPieceAtlas().setViewport(new Rectangle2D(190, 165, 96, 96));
        }

    }

    @Override
    public ArrayList<Location> showPossibleMoves(Piece[][] board) {
        return null;
    }
}
