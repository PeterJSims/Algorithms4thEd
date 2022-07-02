package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class VisualCounter {
    //Ex10
    private final String id;
    private int n;
    private int totalOperations;
    private int maxValue;
    private int currentTally;


    public VisualCounter(String id, int n, int maxValue) {
        this.id = id;
        this.n = n;
        this.maxValue = maxValue;
        setCanvas();
    }

    public VisualCounter(int n, int maxValue) {
        this.id = "VisualCounter";
        this.n = n;
        this.maxValue = maxValue;
        setCanvas();
    }

    private void setCanvas() {
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(-maxValue, maxValue);
        StdDraw.setPenRadius(0.005);
    }

    private void drawPoint() {
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.point(totalOperations, currentTally);
    }

    public void increment() {
        if (n > totalOperations && maxValue > currentTally) {
            currentTally++;
            totalOperations++;
            drawPoint();
        }

    }

    public void decrement() {
        if (n > totalOperations) {
            currentTally--;
            totalOperations++;
            drawPoint();
        }
    }

    public int tally() {
        return currentTally;
    }


    public String toString() {
        return this.id + ": " + this.currentTally;

    }


    public static void main(String[] args) {
        int n = 5000;
        VisualCounter vc = new VisualCounter(n, 500);
        for (int i = 0; i < n; i++) {
            if (StdRandom.bernoulli(.6)) {
                vc.increment();
            } else {
                vc.decrement();
            }
        }
    }
}
