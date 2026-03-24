package model;

public class Player {
    private int id;
    private String name;
    private char symbol; // X or O

    public Player(int id, String name, char symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return name + " (" + symbol + ")";
    }
}
