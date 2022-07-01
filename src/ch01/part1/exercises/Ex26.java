package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(bubble(0, 0, 0)));
        StdOut.println(Arrays.toString(bubble(2, 9, 4)));
    }

    public static int[] bubble(int a, int b, int c) {
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }

        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        return new int[]{a, b, c};
    }
}
