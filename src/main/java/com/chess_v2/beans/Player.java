package com.chess_v2.beans;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Player {
    private String name;

    Color color;

    Player(String name, Color color) {
    this.name= name;
    this.color =  color;
    }

    public boolean isWhite(){
        return color == Color.White;
    }
}
