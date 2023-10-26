package com.chess_v2.beans;

import java.util.ArrayList;

public class Pawn extends Piece {
    private boolean isFirstMove = true;

    @Override
    public void move(Vector2 location) {
        this.setLocation(location);
//        Piece[][] board = game.getBoard();
//        board[this.getLocation().getX()][this.getLocation().getY()] = this;
//        game.setBoard(board);
        if(isFirstMove){
            this.isFirstMove=false;
        }
    }

    @Override
    public ArrayList<Vector2> showPossibleMoves(Piece[][] board) {

        this.clearPossibleMoves();
        Piece temp = board[this.getLocation().getX()][this.getLocation().getY() + 1];
        if (temp != null && temp.isWhite() == this.isWhite()) {
            this.addPossibleMove(new Vector2(this.getLocation()));
        }
        return this.getPossibleMoves();
    }
}
