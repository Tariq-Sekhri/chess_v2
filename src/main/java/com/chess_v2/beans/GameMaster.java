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

    }


}
