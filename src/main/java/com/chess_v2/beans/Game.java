package com.chess_v2.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Game {
    Player p1 = new Player();
    Player p2 = new Player();
    private Piece[][] board = new Piece[8][8];
    private String PGN;

    public void updateBoard(Piece[][] board) {
    this.board = board;
    }
}
