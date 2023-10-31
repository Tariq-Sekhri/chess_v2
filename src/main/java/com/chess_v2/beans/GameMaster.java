package com.chess_v2.beans;


import com.chess_v2.beans.UserInterface.BoardGui;
import lombok.Data;


@Data

public class GameMaster {


    private static GameMaster instance;
    private Game game;

    // private constructor to avoid client applications using the constructor
    private GameMaster() {

    }

    public static GameMaster getInstance() {
        if(instance == null){
            instance = new GameMaster();

        }
        return instance;
    }

    public void newGame() {
        game = new Game();

    }


}
