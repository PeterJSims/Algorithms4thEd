package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        StdOut.println(a == b && b == c ? "equal" : "not equal");
    }
}
