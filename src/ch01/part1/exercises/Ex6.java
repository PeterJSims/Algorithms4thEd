package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex6 {
    public static void main(String[] args) {
        // Fibonacci!
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 20; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
