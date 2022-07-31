package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex5 {
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED", "RV_RETURN_VALUE_IGNORED"})
    public static void main(String[] args) {
        // "Hello world" -- strings are immutable, so any changes you wish to see from methods needs to get assigned
        // back to the string, i.e. s = s.toUpperCase()
        String s = "Hello world";
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);
    }
}
