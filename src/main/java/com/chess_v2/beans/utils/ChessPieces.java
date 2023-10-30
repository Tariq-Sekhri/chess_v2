package com.chess_v2.beans.utils;

public enum ChessPieces {
    King(1000000000),
    Queen(9),
    Rook(5),
    Bishop(3),
    Knight(3),
    Pawn(1);

    private int value;
    private ChessPieces(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
