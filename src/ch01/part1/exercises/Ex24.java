package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex24 {

    public static void main(String[] args) {
        StdOut.println(gcd(1111111, 1234567));
    }

    public static long gcd(long a, long b) {
        StdOut.println(a + " " + b);
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
