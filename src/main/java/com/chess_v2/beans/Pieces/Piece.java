package com.chess_v2.beans.Pieces;

import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Color;
import com.chess_v2.beans.utils.Location;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

@NoArgsConstructor
@Data

public abstract class Piece {

    private Color color;
    private ChessPieces piece;
    private ArrayList<Location> possibleMoves;
    private Location location;

   private ImageView imageVeiw;



    Piece(Location location, Color color,ChessPieces piece) throws FileNotFoundException {
        this.setColor(color);
        this.setLocation(location);
        this.setPiece(piece);
        imageVeiw= new ImageView(new Image(new FileInputStream("src/main/resources/pieceAtlas.png")));
        imageVeiw.setScaleX(0.9);
        imageVeiw.setScaleY(0.9);
    }
    public void move(Location location){
    if(this.getPossibleMoves().contains(location)){
        this.setLocation(location);
    }

    };

    public abstract ArrayList<Location> showPossibleMoves(Piece[][] board);

    public void clearPossibleMoves() {
        possibleMoves.clear();
    }

    public void addPossibleMove(Location possibleMove) {
        possibleMoves.add(possibleMove);
        //        Piece[][] board = game.getBoard();
//        board[this.getLocation().getX()][this.getLocation().getY()] = this;
//        game.setBoard(board);

    }

   }
