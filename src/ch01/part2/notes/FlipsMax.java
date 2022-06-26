package ch01.part2.notes;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class FlipsMax {

    public static Counter max(Counter x, Counter y) {
        return x.tally() > y.tally() ? x : y;
    }


    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int i = 0; i < trials; i++) {
            if (StdRandom.bernoulli()) {
                heads.increment();
            } else {
                tails.increment();
            }
        }

        if (heads.tally() == tails.tally()) {
            StdOut.println("Tie!");
        } else {
            Counter winner = max(heads, tails);
            StdOut.println("\"" + winner.getId() + "\" wins with " + winner.tally() + " flips!");
        }
    }
}
