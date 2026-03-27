package strategy;

import model.Player;

import java.util.List;

public class TicTacToeWinStrategy implements WinStrategy {

    private List<Player> players;

    public TicTacToeWinStrategy(List<Player> players) {
        this.players = players;
    }

    @Override
    public Player checkWinner(char[][] grid) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] != '-' &&
                    grid[i][0] == grid[i][1] &&
                    grid[i][1] == grid[i][2]) {

                return findPlayer(grid[i][0]);
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (grid[0][j] != '-' &&
                    grid[0][j] == grid[1][j] &&
                    grid[1][j] == grid[2][j]) {

                return findPlayer(grid[0][j]);
            }
        }

        // Diagonals
        if (grid[0][0] != '-' &&
                grid[0][0] == grid[1][1] &&
                grid[1][1] == grid[2][2]) {

            return findPlayer(grid[0][0]);
        }

        if (grid[0][2] != '-' &&
                grid[0][2] == grid[1][1] &&
                grid[1][1] == grid[2][0]) {

            return findPlayer(grid[0][2]);
        }

        return null;
    }

    private Player findPlayer(char symbol) {
        for (Player p : players) {
            if (p.getSymbol() == symbol) {
                return p;
            }
        }
        return null;
    }
}
