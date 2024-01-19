import com.chess_v2.beans.Board;
import com.chess_v2.beans.GuiComponants.BoardGui;
import com.chess_v2.beans.Pieces.*;
import com.chess_v2.beans.utils.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import lombok.Data;

import java.io.FileNotFoundException;

@Data
public class Gui extends Application {
    private Bridge bridge;
    private GridPane grid;

    public static void main(String[] args) {
        launch(args);

    }


    @Override
    public void start(Stage stage) throws Exception {

//    BoardGui boardComponan= new BoardGui();
//        grid = boardComponan.updateBoard(new Board());
        ;
//        for (int i = 0; i < 8; i++) {
//            addPiece(new Pawn(new Location(i, 1), com.chess_v2.beans.utils.Color.White));
//            addPiece(new Pawn(new Location(i, 6), com.chess_v2.beans.utils.Color.Black));
//        }
//        addPiece(new Queen(new Location(4, 0), com.chess_v2.beans.utils.Color.White));
//        addPiece(new Queen(new Location(4, 7), com.chess_v2.beans.utils.Color.Black));
//
//        addPiece(new King(new Location(3, 0), com.chess_v2.beans.utils.Color.White));
//        addPiece(new King(new Location(3, 7), com.chess_v2.beans.utils.Color.Black));
//
//        addPiece(new Rook(new Location(0, 0), com.chess_v2.beans.utils.Color.White));
//        addPiece(new Rook(new Location(7, 0), com.chess_v2.beans.utils.Color.White));
//        addPiece(new Rook(new Location(0, 7), com.chess_v2.beans.utils.Color.Black));
//        addPiece(new Rook(new Location(7, 7), com.chess_v2.beans.utils.Color.Black));
//
//        addPiece(new Knight(new Location(1, 0), com.chess_v2.beans.utils.Color.White));
//        addPiece(new Knight(new Location(6, 0), com.chess_v2.beans.utils.Color.White));
//        addPiece(new Knight(new Location(1, 7), com.chess_v2.beans.utils.Color.Black));
//        addPiece(new Knight(new Location(6, 7), com.chess_v2.beans.utils.Color.Black));
//
//        addPiece(new Bishop(new Location(2, 0), com.chess_v2.beans.utils.Color.White));
//        addPiece(new Bishop(new Location(5, 0), com.chess_v2.beans.utils.Color.White));
//        addPiece(new Bishop(new Location(2, 7), com.chess_v2.beans.utils.Color.Black));
//        addPiece(new Bishop(new Location(5, 7), com.chess_v2.beans.utils.Color.Black));


        Scene scene = new Scene(new Button());

        stage.setTitle("Chessboard");
        stage.setScene(scene);

        stage.setMinHeight(800);
        stage.setMinWidth(800);

        stage.setMaxHeight(900);
        stage.setMaxWidth(900);
        stage.show();

    }



}
