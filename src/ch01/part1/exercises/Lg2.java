package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Lg2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
//        StdOut.println(lg2(5005));
//        StdOut.println(lg2(8));
        StdOut.println(lg2(n));
    }

    public static int lg2(int n) {
        int count = 0;
        while (n > 1) {
            n /= 2;
            count++;
        }
        return count;
    }
}
