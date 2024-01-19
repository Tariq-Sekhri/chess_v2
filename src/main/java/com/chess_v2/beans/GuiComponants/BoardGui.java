package com.chess_v2.beans.GuiComponants;

import com.chess_v2.beans.Board;
import com.chess_v2.beans.Pieces.Piece;
import com.chess_v2.beans.utils.Location;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.FileNotFoundException;

public class BoardGui {



    public GridPane makeGrid() {
        GridPane grid = new GridPane();
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
        return grid;
    }

    public GridPane addPiece(GridPane grid, Piece piece) throws FileNotFoundException {

        Location temp = new Location(locationToGridPaneCorordinate(piece.getLocation()));
        grid.add(piece.getPieceAtlas(), temp.getX(), temp.getY());
        return grid;
    }

    public GridPane updateBoard(Board board) throws FileNotFoundException {
        GridPane grid = new GridPane();
        makeGrid();

        for (Piece[] pieces : board.getBoard()) {
            for (Piece piece : pieces) {
                grid = addPiece(grid,piece);
            }
        }

//        for (int i = 0; i < board.getBoard().length; i++) {
//            for (int j = 0; j < board.getBoard().length; j++) {
//
//            }
//        }
        return grid;
    }

    public Location locationToGridPaneCorordinate(Location location) {
        return new Location(location.getX(), 7 - location.getY());
    }

//    public Location GridPaneCorordinateTolocation(gridpane cild at locatiom or location location ){
//                return new Location(location.getX(), 7-location.getY());
//    }

}
