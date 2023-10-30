package com.chess_v2.beans.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Location {
    private int x;
    private int y;

    public Location(Location location){
        x = location.getX();
        y = location.getY();
    }
    public Location(int x , int y){
        this.x = x;
        this.y = y;
    }
}
