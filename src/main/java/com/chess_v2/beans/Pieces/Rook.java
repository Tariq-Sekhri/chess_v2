package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;
import javafx.geometry.Rectangle2D;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Rook extends Piece{

    public Rook(Location location, Color color)  throws FileNotFoundException {
        super(location, color, ChessPieces.Rook);
        if (color == Color.Black) {
            getPieceAtlas().setViewport(new Rectangle2D(357, 25, 96, 96));
        }else{
            getPieceAtlas().setViewport(new Rectangle2D(357, 165, 96, 96));
        }
    }


    @Override
    public ArrayList<Location> showPossibleMoves(Piece[][] board) {
        return null;
    }
}
