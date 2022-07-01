package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex16 {
    public static void main(String[] args) {
        StdOut.println(exR1(6)); //311361142246
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
