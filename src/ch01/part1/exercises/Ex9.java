package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex9 {

    public static void main(String[] args) {
        StdOut.println(toBinary(50));
    }

    public static String toBinary(int n) {
        String s = "";
        for (int k = n; k > 0; k /= 2) {
            s = (k % 2) + s;
        }
        return s;
    }
}
