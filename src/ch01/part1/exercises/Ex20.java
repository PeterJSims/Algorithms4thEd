package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex20 {

    private static double ln(int n) {
        if (n <= 0) return 0;
        return ln(n - 1) + Math.log(n);
    }

    public static void main(String[] args) {
        StdOut.println(ln(5));
        StdOut.println(ln(9));
    }
}
