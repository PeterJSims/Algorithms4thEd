package ch01.part4.notes;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.ThreeSum;

public class DoublingTest {

    public static double timeTrial(int n) {
        // Time ThreeSum.count() for n random 6-digit integers
        int MAX = 1000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }

        Stopwatch timer = new Stopwatch();
        int count = ThreeSum.count(a);
        return timer.elapsedTime();
    }


    public static void main(String[] args) {
        for (int n = 250; true; n *= 2) {
            double time = timeTrial(n);
            StdOut.printf("%7d %.1f\n", n, time);
        }
    }
}
