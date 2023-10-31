package com.chess_v2.beans;

import com.chess_v2.beans.Pieces.Piece;
import com.chess_v2.beans.utils.Color;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Game {
    private Player p1;
    private Player p2;
    private Board board = new Board();
    private String PGN;

    Game(String[] PlayerNames) {
        p1 = new Player(PlayerNames[0], Color.White);
        p2 = new Player(PlayerNames[1],Color.Black);
    }




}
