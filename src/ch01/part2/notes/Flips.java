package ch01.part2.notes;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flips {

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
        StdOut.println(heads);
        StdOut.println(tails);
        int delta = Math.abs(heads.tally() - tails.tally());
        StdOut.println("delta: " + delta);
    }
}
