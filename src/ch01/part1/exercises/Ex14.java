package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex14 {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            StdOut.println(log2(num));
            StdOut.println(Math.log(num) / Math.log(2));

        }
    }

    public static int log2(int n) {
        int count = 0;
        while (n > 1) {
            count++;
            n /= 2;
        }
        return count;
    }
}
