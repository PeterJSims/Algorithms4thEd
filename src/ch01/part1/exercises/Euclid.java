package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Euclid {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        StdOut.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
//        StdOut.println(a + " " + b);
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
