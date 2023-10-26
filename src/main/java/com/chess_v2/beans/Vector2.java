package com.chess_v2.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vector2 {
    private int x;
    private int y;

    public Vector2(Vector2 location){
        x = location.getX();
        y = location.getY();
    }
}
