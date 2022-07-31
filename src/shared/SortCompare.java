package shared;

import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.*;

public class SortCompare {

    public static double time(String alg, Double[] a) {
        edu.princeton.cs.algs4.Stopwatch timer = new Stopwatch();
        if (alg.equalsIgnoreCase("Insertion")) Insertion.sort(a);
        if (alg.equalsIgnoreCase("Selection")) Selection.sort(a);
        if (alg.equalsIgnoreCase("Shell")) Shell.sort(a);
        if (alg.equalsIgnoreCase("Merge")) Merge.sort(a);
        if (alg.equalsIgnoreCase("Quick")) Quick.sort(a);
        if (alg.equalsIgnoreCase("Heap")) Heap.sort(a);

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int n, int trials) {
        double total = 0.0;
        Double[] a = new Double[n];
        for (int t = 0; t < trials; t++) {
            // Perform one experiment - create an array of random Doubles and add its sorting time to total
            for (int i = 0; i < n; i++) {
                a[i] = StdRandom.uniform(0.0, 1.0);
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int n = Integer.parseInt(args[2]);
        int trials = Integer.parseInt(args[3]);
        double time1 = timeRandomInput(alg1, n, trials);
        double time2 = timeRandomInput(alg2, n, trials);

        double maxTime = Math.max(time1, time2);
        double minTime = maxTime == time1 ? time2 : time1;

        String winningAlgo = minTime == time1 ? alg1 : alg2;
        String losingAlgo = maxTime == time1 ? alg1 : alg2;


        double ratio = maxTime / minTime;
        StdOut.printf("For %d random Doubles\n   %s is", n, winningAlgo);
        StdOut.printf(" %.1f times faster than %s\n", ratio, losingAlgo);
    }
}

