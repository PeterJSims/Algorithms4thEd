package ch01.part4.notes;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class DoublingRatio {
    public static double timeTrial(int n) {
        // Time ThreeSum.count() for n random 6-digit integers
        int MAX = 1000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }

        Stopwatch timer = new Stopwatch();
        int count = ThreeSumFast.count(a); // PUT ALGORITHM HERE
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        double prev = timeTrial(125);
        for (int n = 250; true; n *= 2) {
            double time = timeTrial(n);
            StdOut.printf("%7d %7.1f ", n, time);
            StdOut.printf("%5.1f\n", time / prev);
            prev = time;
        }
    }
}
