package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

public class Ex21 {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            players.add(new Player(s, a, b));
        }

        StdOut.println();
        StdOut.printf("%5s", "Player Name");
        StdOut.printf("%20s", "Stat One");
        StdOut.printf("%20s", "Stat Two");
        StdOut.printf("%15s", "Average");
        StdOut.println();
        
        for (int i = 0; i < 90; i++) {
            StdOut.print("-");
        }
        StdOut.println();

        for (Player p : players) {
            printStats(p);
            StdOut.println();
        }
    }

    public static void printStats(Player player) {
        StdOut.printf("%5s", player.name);
        StdOut.printf("%20d", player.statOne);
        StdOut.printf("%20d", player.statTwo);
        StdOut.printf("%20.3f", player.avgStat);

    }

    private static class Player {
        String name;
        int statOne;
        int statTwo;
        double avgStat;

        public Player(String name, int statOne, int statTwo) {
            this.name = name;
            this.statOne = statOne;
            this.statTwo = statTwo;
            this.avgStat = (statOne * 1.0) / statTwo;
        }

    }
}
