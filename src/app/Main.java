package app;

import engine.GameEngine;
import engine.TurnManager;
import games.tictactoe.TicTacToeGame;
import model.Player;
import model.Move;
import model.GameState;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player p1 = new Player(1, "Player1", 'X');
        Player p2 = new Player(2, "Player2", 'O');

        List<Player> players = Arrays.asList(p1, p2);

        TicTacToeGame game = new TicTacToeGame(players);
        TurnManager turnManager = new TurnManager(players);
        GameEngine engine = new GameEngine(game, turnManager);

        System.out.println("=== Tic Tac Toe Game Started ===");

        while (game.getGameState() == GameState.ONGOING) {

            Player currentPlayer = turnManager.getCurrentPlayer();
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");

            try {
                System.out.print("Enter row (0-2): ");
                int row = scanner.nextInt();

                System.out.print("Enter col (0-2): ");
                int col = scanner.nextInt();

                Move move = new Move(currentPlayer, row, col);

                engine.playMove(move);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        engine.displayGameStatus();
    }
}