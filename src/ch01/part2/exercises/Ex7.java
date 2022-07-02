package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex7 {
    // the string is printed in reverse
    public static void main(String[] args) {
        StdOut.println(mystery("hello"));
    }

    public static String mystery(String s) {
        int n = s.length();
        if (n <= 1) return s;
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);
        return mystery(b) + mystery(a);
    }
}
