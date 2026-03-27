package strategy;

import model.Player;

public interface WinStrategy {
    Player checkWinner(char[][] board);
}
