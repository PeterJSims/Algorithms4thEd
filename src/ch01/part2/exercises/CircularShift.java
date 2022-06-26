package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class CircularShift {
    public static void main(String[] args) {
        String a = StdIn.readLine();
        String b = StdIn.readLine();
        StdOut.println(determineIfCircularShift(a, b));

    }

    public static boolean determineIfCircularShift(String s, String t) {
        return (s.length() == t.length()) && (s.concat(s).indexOf(t) >= 0);
    }
}
