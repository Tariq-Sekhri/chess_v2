package com.chess_v2.beans;

import com.chess_v2.beans.Pieces.Piece;
import com.chess_v2.beans.utils.Color;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileNotFoundException;

@Data
@NoArgsConstructor

public class Game {
    private Player p1;
    private Player p2;
    private Board board;

    private String PGN;

    Game(String[] PlayerNames) throws FileNotFoundException {
        p1 = new Player(PlayerNames[0], Color.White);
        p2 = new Player(PlayerNames[1],Color.Black);
        board = new Board();
    }




}
