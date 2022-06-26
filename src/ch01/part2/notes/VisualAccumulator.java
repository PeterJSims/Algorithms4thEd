package ch01.part2.notes;

import edu.princeton.cs.algs4.StdDraw;

public class VisualAccumulator extends Accumulator {
    private double sum;
    private int n;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double value) {
        n++;
        sum += value;
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.point(n, value);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(n, mean());
    }

    public double mean() {
        return sum / n;
    }

    @Override
    public String toString() {
        String s = "Mean (" + n + " values): ";
        return s + String.format("%7.5f", mean());
    }
}
