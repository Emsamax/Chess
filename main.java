import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        chessBoard Board = new chessBoard();
        Board.createBoard();

        dataBase Base = new dataBase();
        ArrayList<String> b = Base.createDataBase();
        Base.printArray(b);
    }

}
