package games.tictactoe;

import engine.Game;
import exception.InvalidMoveException;
import model.Move;
import model.Player;
import model.GameState;
import strategy.WinStrategy;
import strategy.TicTacToeWinStrategy;

import java.util.List;

public class TicTacToeGame extends Game {

    private Board board;
    private WinStrategy winStrategy;

    public TicTacToeGame(List<Player> players) {
        super(players);
        this.board = new Board(3);
        this.winStrategy = new TicTacToeWinStrategy(players);
    }

    @Override
    public void makeMove(Move move) {

        int row = move.getRow();
        int col = move.getCol();

        // ✅ Boundary check
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            throw new InvalidMoveException("Invalid position! Enter values between 0 and 2.");
        }

        // ✅ Check if cell is empty
        if (!board.isCellEmpty(row, col)) {
            throw new InvalidMoveException("Cell already occupied!");
        }

        // ✅ Place move
        board.placeMove(row, col, move.getPlayer().getSymbol());

        // ✅ Print board after move
        board.printBoard();
    }

    @Override
    public void checkWinner() {

        Player winnerPlayer = winStrategy.checkWinner(board.getGrid());

        if (winnerPlayer != null) {
            gameState = GameState.WIN;
            winner = winnerPlayer;
        }
    }
}
