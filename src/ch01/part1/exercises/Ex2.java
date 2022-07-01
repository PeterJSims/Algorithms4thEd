package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex2 {
    public static void main(String[] args) {
        //double - 1.618
        StdOut.println((1 + 2.236) / 2);
        //double - 10.0
        StdOut.println(1 + 2 + 3 + 4.0);
        //boolean - true
        StdOut.println(4.1 >= 4);
        //String - "33"  -- infix operations from left to right == (1+2) + "3" == 3 + "3
        StdOut.println(1 + 2 + "3");
    }
}
