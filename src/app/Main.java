package app;

import exception.InvalidMoveException;
import exception.GameOverException;

public class Main {
    public static void main(String[] args) {

        try {
            throw new InvalidMoveException("Invalid move test");
        } catch (InvalidMoveException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            throw new GameOverException("Game over test");
        } catch (GameOverException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}