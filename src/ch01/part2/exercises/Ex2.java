package ch01.part2.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[n];
        for (int i = 0; i < n; i++) {
            double min = StdRandom.uniform();
            double max = StdRandom.uniform();
//            double min = StdIn.readDouble();
//            double max = StdIn.readDouble();
            min = Math.min(min, max);
            max = Math.max(min, max);
            intervals[i] = new Interval1D(min, max);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    StdOut.println(intervals[i] + " intersects " + intervals[j]);
                }
            }
        }
    }
}
