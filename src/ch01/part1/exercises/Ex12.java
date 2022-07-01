package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex12 {
    public static void main(String[] args) {
        // 0 1 2 3 4 4 3 2 1 0
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            StdOut.println(a[i]);
        }
    }
}
