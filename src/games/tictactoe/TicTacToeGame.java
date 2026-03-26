package games.tictactoe;

import engine.Game;
import exception.InvalidMoveException;
import model.Move;
import model.Player;
import model.GameState;

import java.util.List;

public class TicTacToeGame extends Game {

    private Board board;

    public TicTacToeGame(List<Player> players) {
        super(players);
        this.board = new Board(3);
    }

    @Override
    public void makeMove(Move move) {

        int row = move.getRow();
        int col = move.getCol();

        if (!board.isCellEmpty(row, col)) {
            throw new InvalidMoveException("Cell already occupied!");
        }

        board.placeMove(row, col, move.getPlayer().getSymbol());
        board.printBoard();
    }

    @Override
    public void checkWinner() {

        char[][] grid = board.getGrid();

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] != '-' &&
                    grid[i][0] == grid[i][1] &&
                    grid[i][1] == grid[i][2]) {

                gameState = GameState.WIN;
                winner = findPlayerBySymbol(grid[i][0]);
                return;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (grid[0][j] != '-' &&
                    grid[0][j] == grid[1][j] &&
                    grid[1][j] == grid[2][j]) {

                gameState = GameState.WIN;
                winner = findPlayerBySymbol(grid[0][j]);
                return;
            }
        }

        // Check diagonals
        if (grid[0][0] != '-' &&
                grid[0][0] == grid[1][1] &&
                grid[1][1] == grid[2][2]) {

            gameState = GameState.WIN;
            winner = findPlayerBySymbol(grid[0][0]);
            return;
        }

        if (grid[0][2] != '-' &&
                grid[0][2] == grid[1][1] &&
                grid[1][1] == grid[2][0]) {

            gameState = GameState.WIN;
            winner = findPlayerBySymbol(grid[0][2]);
        }
    }

    private Player findPlayerBySymbol(char symbol) {
        for (Player p : players) {
            if (p.getSymbol() == symbol) {
                return p;
            }
        }
        return null;
    }
}
