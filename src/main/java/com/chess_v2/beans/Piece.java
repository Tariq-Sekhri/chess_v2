package com.chess_v2.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data

public abstract class Piece {

    private boolean isWhite;
    private ArrayList<Vector2> possibleMoves;
    private  Vector2 location;
    public abstract void move(Vector2 location);
    public abstract ArrayList<Vector2> showPossibleMoves(Piece[][] board);

    public void clearPossibleMoves(){
        possibleMoves.clear();
    }

    public void addPossibleMove(Vector2 possibleMove){
    possibleMoves.add(possibleMove);
    }
}
