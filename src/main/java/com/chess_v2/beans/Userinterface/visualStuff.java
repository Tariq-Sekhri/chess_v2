package com.chess_v2.beans.Userinterface;


import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class visualStuff extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Image image = new Image(new FileInputStream("src/main/resources/PieceIcons/chessImages.png"));

        //Setting the image view
        ImageView kingImageVeiw = new ImageView(image);
        kingImageVeiw.setViewport(new Rectangle2D(20,20,96,96));

        GridPane grid = new GridPane();

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Rectangle square = new Rectangle(100, 100);
                if ((x + y) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.BLACK);
                }
                grid.add(square, x, y);
            }
        }
        grid.add(kingImageVeiw, 0,0);
        Scene scene = new Scene(grid, 800, 800);

        stage.setTitle("Chessboard");
        stage.setScene(scene);

        stage.setMinHeight(800);
        stage.setMinWidth(800);

        stage.setMaxHeight(1000);
        stage.setMaxWidth(1000);
        stage.show();

    }


}
