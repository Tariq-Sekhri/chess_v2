package com.chess_v2.beans.UserInterface;


import com.chess_v2.beans.Board;
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
public class BoardGui extends Application {
    private GridPane grid;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {


        grid = new GridPane();
makeGrid();
        for (int i = 0; i < 8; i++) {
            addPiece(new Pawn(new Location(i,1), com.chess_v2.beans.utils.Color.White));
            addPiece(new Pawn(new Location(i,6), com.chess_v2.beans.utils.Color.Black));
        }
        addPiece(new Queen(new Location(4,0), com.chess_v2.beans.utils.Color.White));
        addPiece(new Queen(new Location(4,7), com.chess_v2.beans.utils.Color.Black));

        addPiece(new King(new Location(3,0), com.chess_v2.beans.utils.Color.White));
        addPiece(new King(new Location(3,7), com.chess_v2.beans.utils.Color.Black));

        addPiece(new Rook(new Location(0,0), com.chess_v2.beans.utils.Color.White));
        addPiece(new Rook(new Location(7,0), com.chess_v2.beans.utils.Color.White));
        addPiece(new Rook(new Location(0,7), com.chess_v2.beans.utils.Color.Black));
        addPiece(new Rook(new Location(7,7), com.chess_v2.beans.utils.Color.Black));

        addPiece(new Knight(new Location(1,0), com.chess_v2.beans.utils.Color.White));
        addPiece(new Knight(new Location(6,0), com.chess_v2.beans.utils.Color.White));
        addPiece(new Knight(new Location(1,7), com.chess_v2.beans.utils.Color.Black));
        addPiece(new Knight(new Location(6,7), com.chess_v2.beans.utils.Color.Black));

        addPiece(new Bishop(new Location(2,0), com.chess_v2.beans.utils.Color.White));
        addPiece(new Bishop(new Location(5,0), com.chess_v2.beans.utils.Color.White));
        addPiece(new Bishop(new Location(2,7), com.chess_v2.beans.utils.Color.Black));
        addPiece(new Bishop(new Location(5,7), com.chess_v2.beans.utils.Color.Black));


        Scene scene = new Scene(grid, 800, 800);

        stage.setTitle("Chessboard");
        stage.setScene(scene);

        stage.setMinHeight(800);
        stage.setMinWidth(800);

        stage.setMaxHeight(900);
        stage.setMaxWidth(900);
        stage.show();

    }

    private void makeGrid() {
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
    }

    public void addPiece(Piece piece) throws FileNotFoundException {
        Location temp = new Location(locationToGridPaneCorordinate(piece.getLocation()));
        grid.add(piece.getPieceAtlas(), temp.getX(), temp.getY());
    }

    public void updateBoard(Board board) throws FileNotFoundException {
        grid = new GridPane();
        makeGrid();
        
        for (Piece[] pieces : board.getBoard() ){
            for (Piece piece:pieces) {
                addPiece(piece);
            }
        }

//        for (int i = 0; i < board.getBoard().length; i++) {
//            for (int j = 0; j < board.getBoard().length; j++) {
//
//            }
//        }
    }

    public Location locationToGridPaneCorordinate(Location location) {
        return new Location(location.getX(), 7 - location.getY());
    }

//    public Location GridPaneCorordinateTolocation(gridpane cild at locatiom or location location ){
//                return new Location(location.getX(), 7-location.getY());
//    }
}
