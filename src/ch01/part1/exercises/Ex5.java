package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex5 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        StdOut.println((x > 0 && y > 0) && (x < 1 && y < 1));
    }
}
