package ch01.part2.notes;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestAccumulator {

    public static void main(String[] args) {
        Accumulator accumulator;
        String mode = "";
        int trials = Integer.parseInt(args[0]);
        if (args.length > 1) {
            mode = args[1].toLowerCase();
        }
        if (mode.contains("visual")) {
            accumulator = new VisualAccumulator(trials, 1.0);
        } else {
            accumulator = new Accumulator();
        }
        for (int i = 0; i < trials; i++) {
            accumulator.addDataValue(StdRandom.uniform(0.0, 1.0));
        }
        StdOut.println(accumulator);
    }
}
