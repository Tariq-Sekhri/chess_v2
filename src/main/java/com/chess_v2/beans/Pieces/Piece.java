package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data

public abstract class Piece {

    private Color color;
    private ChessPieces piece;
    private ArrayList<Location> possibleMoves;
    private Location location;


    Piece(Location location, Color color,ChessPieces piece){
        this.setColor(color);
        this.setLocation(location);
        this.setPiece(piece);
    }
    public void move(Location location){
    if(this.getPossibleMoves().contains(location)){
        this.setLocation(location);
    }

    };

    public abstract ArrayList<Location> showPossibleMoves(Piece[][] board);

    public void clearPossibleMoves() {
        possibleMoves.clear();
    }

    public void addPossibleMove(Location possibleMove) {
        possibleMoves.add(possibleMove);
        //        Piece[][] board = game.getBoard();
//        board[this.getLocation().getX()][this.getLocation().getY()] = this;
//        game.setBoard(board);

    }

   }
