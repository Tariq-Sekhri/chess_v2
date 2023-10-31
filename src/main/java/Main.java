import com.chess_v2.beans.GameMaster;
import com.chess_v2.beans.UserInterface.BoardGui;

public class Main {
    public static void main(String[] args) {

        GameMaster.getInstance();

        BoardGui.main(args);

    }
}
