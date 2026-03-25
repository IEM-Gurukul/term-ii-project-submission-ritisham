package engine;

import exception.GameOverException;
import model.Move;
import model.GameState;

public class GameEngine {

    private Game game;
    private TurnManager turnManager;

    public GameEngine(Game game, TurnManager turnManager) {
        this.game = game;
        this.turnManager = turnManager;
    }

    public void playMove(Move move) {

        if (game.getGameState() != GameState.ONGOING) {
            throw new GameOverException("Game has already ended!");
        }

        game.makeMove(move);

        game.checkWinner();

        if (game.getGameState() == GameState.ONGOING) {
            turnManager.nextTurn();
        }
    }

    public void displayGameStatus() {
        if (game.getGameState() == GameState.WIN) {
            System.out.println("Winner: " + game.getWinner());
        } else if (game.getGameState() == GameState.DRAW) {
            System.out.println("Game ended in a draw.");
        } else {
            System.out.println("Game is ongoing.");
        }
    }
}
