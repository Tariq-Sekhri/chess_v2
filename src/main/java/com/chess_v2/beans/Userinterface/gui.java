package com.chess_v2.beans.Userinterface;


import com.chess_v2.beans.Pieces.Piece;
import com.chess_v2.beans.Pieces.Queen;
import com.chess_v2.beans.utils.ChessPieces;
import com.chess_v2.beans.utils.Location;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
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
        Queen q1 = new Queen(new Location(1,1), com.chess_v2.beans.utils.Color.Black);

        addPiece(q1);

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
        grid.add(piece.getImageVeiw(),piece.getLocation().getX(),piece.getLocation().getX());
    }


}
