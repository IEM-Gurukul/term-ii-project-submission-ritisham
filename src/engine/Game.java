package engine;

import model.Player;
import model.Move;
import model.GameState;

import java.util.List;

public abstract class Game {

    protected List<Player> players;
    protected GameState gameState;
    protected Player winner;

    public Game(List<Player> players) {
        this.players = players;
        this.gameState = GameState.ONGOING;
    }

    public abstract void makeMove(Move move);

    public abstract void checkWinner();

    public GameState getGameState() {
        return gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public List<Player> getPlayers() {
        return players;
    }
}