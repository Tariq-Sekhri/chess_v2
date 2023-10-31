package com.chess_v2.beans;

import com.chess_v2.beans.Pieces.*;
import com.chess_v2.beans.utils.*;
import lombok.Data;

@Data
public class Board {
    private Piece[][] board = new Piece[8][8];

    public Board() {
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Location(1, i),Color.White);
            board[6][i] = new Pawn(new Location(6, i),Color.Black );
        }
        board[0][0] = new Rook( new Location(0, 0),Color.White);
        board[0][1] = new Knight(new Location(0, 1), Color.White);
        board[0][2] = new Bishop(new Location(0, 2), Color.White);
        board[0][3] = new Queen(new Location(0, 3), Color.White);
        board[0][4] = new King(new Location(0, 4), Color.White);
        board[0][5] = new Bishop(new Location(0, 5), Color.White);
        board[0][6] = new Knight(new Location(0, 6), Color.White);
        board[0][7] = new Rook(new Location(0, 7), Color.White);

        board[7][0] = new Rook(new Location(7, 0),Color.Black );
        board[7][1] = new Knight( new Location(7, 1),Color.Black);
        board[7][2] = new Bishop( new Location(7, 2),Color.Black);
        board[7][3] = new Queen( new Location(7, 3),Color.Black );
        board[7][4] = new King( new Location(7, 4),Color.Black);
        board[7][5] = new Bishop( new Location(7, 5),Color.Black);
        board[7][6] = new Knight( new Location(7, 6),Color.Black);
        board[7][7] = new Rook( new Location(7, 7),Color.Black);
    }


}
