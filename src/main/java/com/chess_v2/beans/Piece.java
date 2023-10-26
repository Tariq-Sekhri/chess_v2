package com.chess_v2.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public abstract class Piece {

    private int locationX;
    private int locationY;
    public abstract void move();


}
