package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Vector2;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data

public abstract class Piece {

    private Color color;
    private ChessPieces piece;
    private ArrayList<Vector2> possibleMoves;
    private Vector2 location;

    public void move(Vector2 location){
    if(this.getPossibleMoves().contains(location)){
        this.setLocation(location);
    }

    };

    public abstract ArrayList<Vector2> showPossibleMoves(Piece[][] board);

    public void clearPossibleMoves() {
        possibleMoves.clear();
    }

    public void addPossibleMove(Vector2 possibleMove) {
        possibleMoves.add(possibleMove);
        //        Piece[][] board = game.getBoard();
//        board[this.getLocation().getX()][this.getLocation().getY()] = this;
//        game.setBoard(board);

    }

   }
