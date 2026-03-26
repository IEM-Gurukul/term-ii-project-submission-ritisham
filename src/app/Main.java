package app;

import engine.GameEngine;
import engine.TurnManager;
import games.tictactoe.TicTacToeGame;
import model.Player;
import model.Move;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player(1, "Player1", 'X');
        Player p2 = new Player(2, "Player2", 'O');

        List<Player> players = Arrays.asList(p1, p2);

        TicTacToeGame game = new TicTacToeGame(players);
        TurnManager turnManager = new TurnManager(players);
        GameEngine engine = new GameEngine(game, turnManager);

        engine.playMove(new Move(p1, 0, 0));
        engine.playMove(new Move(p2, 1, 1));
        engine.playMove(new Move(p1, 0, 1));
        engine.playMove(new Move(p2, 2, 2));
        engine.playMove(new Move(p1, 0, 2)); // Winning move

        engine.displayGameStatus();
    }
}