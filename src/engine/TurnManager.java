package engine;

import model.Player;

import java.util.List;

public class TurnManager {

    private List<Player> players;
    private int currentTurnIndex;

    public TurnManager(List<Player> players) {
        this.players = players;
        this.currentTurnIndex = 0;
    }

    public Player getCurrentPlayer() {
        return players.get(currentTurnIndex);
    }

    public void nextTurn() {
        currentTurnIndex = (currentTurnIndex + 1) % players.size();
    }
}
