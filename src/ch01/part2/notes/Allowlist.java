package ch01.part2.notes;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Allowlist {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();

        StaticSETofInts set = new StaticSETofInts(a);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (!set.contains(key)) {
                StdOut.println(key);
            }
        }
    }
}
