package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex20 {
    public static double ln(double n) {
        if (n == 1) {
            return 0;
        }

        return Math.log(n) + ln(n - 1);
    }

    public static void main(String[] args) {
        StdOut.println(ln(3));
    }
}
