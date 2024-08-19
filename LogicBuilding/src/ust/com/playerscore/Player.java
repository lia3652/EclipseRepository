package ust.com.playerscore;

public class Player {
    String name;
    int score;

    // Constructor
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return name + " " + score;
    }
}
