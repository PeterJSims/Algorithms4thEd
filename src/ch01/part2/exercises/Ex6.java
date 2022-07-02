package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex6 {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            String t = StdIn.readString();
            StdOut.println(isCircularShift(s, t));

        }
    }

    private static boolean isCircularShift(String s, String t) {
        if (s.length() != t.length()) return false;
        t = t + t;
        return t.indexOf(s) != -1;
    }
}
