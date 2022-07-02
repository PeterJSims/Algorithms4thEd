package ch01.part2.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex4 {
    public static void main(String[] args) {
//        "world hello"
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}
