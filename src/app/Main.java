package app;

import engine.GameEngine;
import engine.TurnManager;
import games.tictactoe.TicTacToeGame;
import model.Player;
import model.Move;
import model.GameState;
import ui.ConsoleUI;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ConsoleUI ui = new ConsoleUI();

        Player p1 = new Player(1, "Player1", 'X');
        Player p2 = new Player(2, "Player2", 'O');

        List<Player> players = Arrays.asList(p1, p2);

        TicTacToeGame game = new TicTacToeGame(players);
        TurnManager turnManager = new TurnManager(players);
        GameEngine engine = new GameEngine(game, turnManager);

        ui.showMessage("=== Tic Tac Toe Game Started ===");

        while (true) {

            if (game.getGameState() != GameState.ONGOING) {
                break;
            }

            Player currentPlayer = turnManager.getCurrentPlayer();
            ui.showTurn(currentPlayer.getName(), currentPlayer.getSymbol());

            try {
                int row = ui.getRowInput();
                int col = ui.getColInput();

                Move move = new Move(currentPlayer, row, col);
                engine.playMove(move);

                // Stop immediately after win/draw
                if (game.getGameState() != GameState.ONGOING) {
                    break;
                }

            } catch (InputMismatchException e) {
                ui.showInvalidInput();
            } catch (Exception e) {
                ui.showMessage("Error: " + e.getMessage());
            }
        }

        engine.displayGameStatus();
    }
}