package com.chess_v2.beans.Userinterface;


import com.chess_v2.beans.Pieces.*;
import com.chess_v2.beans.utils.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import lombok.Data;

import java.io.FileNotFoundException;

@Data
public class gui extends Application {
    private GridPane grid;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        grid = new GridPane();


        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Rectangle square = new Rectangle(100, 100);
                if ((x + y) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.GREEN);
                }
                grid.add(square, x, y);
            }
        }


        initBoard();
        Scene scene = new Scene(grid, 800, 800);

        stage.setTitle("Chessboard");
        stage.setScene(scene);

        stage.setMinHeight(800);
        stage.setMinWidth(800);

        stage.setMaxHeight(900);
        stage.setMaxWidth(900);
        stage.show();

    }

    public void addPiece(Piece piece) throws FileNotFoundException {
        Location temp = new Location(locationToGridPaneCorordinate(piece.getLocation()));
        grid.add( piece.getImageVeiw(),temp.getX(),temp.getY());
    }

    public void initBoard() throws FileNotFoundException {
        for (int i = 0; i < 8; i++) {
        addPiece(new Pawn(new Location(i,1), com.chess_v2.beans.utils.Color.Black));

        }

        for (int i = 0; i < 8; i++) {
            addPiece(new Pawn(new Location(i,1), com.chess_v2.beans.utils.Color.Black));

        }
        addPiece(new Queen(new Location(3,4), com.chess_v2.beans.utils.Color.Black));
        addPiece(new Queen(new Location(2,2), com.chess_v2.beans.utils.Color.Black));
    }

    public Location locationToGridPaneCorordinate(Location location){
                return new Location(8-location.getX(), 8-location.getY());
    }

//    public Location GridPaneCorordinateTolocation(Location location){
//                return new Location(8-location.getX(), 8-location.getY());
//    }
}
