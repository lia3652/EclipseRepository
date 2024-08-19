package ust.com.playerscore;

import java.util.Comparator;

public class Checker {
    // Comparator to sort players by score in descending order and name in ascending order
    public static final Comparator<Player> PLAYER_COMPARATOR = new Comparator<Player>() {
        @Override
        public int compare(Player p1, Player p2) {
            // First compare by score in descending order
            int scoreComparison = Integer.compare(p2.getScore(), p1.getScore());
            if (scoreComparison != 0) {
                return scoreComparison;
            }
            // If scores are the same, compare by name in ascending order
            return p1.getName().compareTo(p2.getName());
        }
    };
}
