package ui;

import java.util.Scanner;

public class ConsoleUI {

    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    public int getRowInput() {
        System.out.print("Enter row (0-2): ");
        return scanner.nextInt();
    }

    public int getColInput() {
        System.out.print("Enter col (0-2): ");
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showTurn(String playerName, char symbol) {
        System.out.println("\n" + playerName + "'s turn (" + symbol + ")");
    }

    public void showInvalidInput() {
        System.out.println("Invalid input! Please enter numbers only.");
    }
}
