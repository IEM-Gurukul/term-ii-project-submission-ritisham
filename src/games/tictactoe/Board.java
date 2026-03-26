package games.tictactoe;

public class Board {

    private char[][] grid;
    private int size;

    public Board(int size) {
        this.size = size;
        grid = new char[size][size];

        // Initialize board with empty cells
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == '-';
    }

    public void placeMove(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}