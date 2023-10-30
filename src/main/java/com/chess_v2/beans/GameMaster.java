package com.chess_v2.beans;

import com.chess_v2.beans.Pieces.Piece;
import com.chess_v2.beans.Pieces.Rook;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameMaster {

    Game game;
    public void newGame(){
        game = new Game();
         Piece[][] board = new Piece[8][8];
        board[0][0] = new Rook(new Location(0,0), Color.White);
        board[8][0] = new Rook(new Location(8,0), Color.White);

        board[0][8] = new Rook(new Location(0,0), Color.White);
        board[8][8] = new Rook(new Location(8,0), Color.White);
        game.setBoard(board);
    }


}
