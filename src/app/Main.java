package app;

import model.Player;
import model.Move;
import model.GameState;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player(1, "Subham", 'X');
        Player p2 = new Player(2, "Ritisha", 'O');

        Move move = new Move(p1, 0, 1);

        System.out.println("Player: " + p1);
        System.out.println("Move: Row " + move.getRow() + ", Col " + move.getCol());
        System.out.println("Game State: " + GameState.ONGOING);
    }
}