package ust.com.playerscore;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of players
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array to store players
        Player[] players = new Player[numPlayers];

        // Read each player's name and score
        for (int i = 0; i < numPlayers; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            players[i] = new Player(name, score);
        }

        // Sort the players array using the Checker class
        Arrays.sort(players, Checker.PLAYER_COMPARATOR);

        // Print the sorted players
        for (Player player : players) {
            System.out.println(player);
        }

        // Close the scanner
        scanner.close();
    }
}
