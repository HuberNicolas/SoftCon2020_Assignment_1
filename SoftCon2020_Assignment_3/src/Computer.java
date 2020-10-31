import java.util.ArrayList;

public class Computer extends Player {
    Computer(GameBoard board, GameBoard sBoard) {
        Name = "Computer";
        Board = board;
        SBoard = sBoard;
        ShipsAlive = 9;
        ArrayList<Ship> shipList = new ArrayList<Ship>();
    }
}
