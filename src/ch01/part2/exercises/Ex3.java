package ch01.part2.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex3 {
    private static Interval2D[] generateNIntervals(int n, double min, double max) {
        Interval2D[] intervals = new Interval2D[n];

        for (int i = 0; i < n; i++) {
            double xMin = StdRandom.uniform(min, max);
            double xMax = StdRandom.uniform(xMin, max);
            double yMin = StdRandom.uniform(min, max);
            double yMax = StdRandom.uniform(yMin, max);
            intervals[i] = new Interval2D(new Interval1D(xMin, xMax), new Interval1D(yMin, yMax));
            intervals[i].draw();
        }
        return intervals;
    }

    public static int countIntersections(Interval2D[] intervals) {
        int intersections = 0;
        int n = intervals.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    intersections++;
                }
            }
        }
        return intersections;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        Interval2D[] intervals = generateNIntervals(n, min, max);

        int intersections = countIntersections(intervals);

        StdOut.println("Number of intersections: " + intersections);

    }
}
