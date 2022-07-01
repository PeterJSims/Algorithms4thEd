package ch01.part1.exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex23 {

    public static int indexOf(int[] a, int key) {
        return indexOf(a, key, 0, a.length - 1, "");
    }

    public static int indexOf(int[] a, int key, int lo, int hi, String level) {
        StdOut.println(level + lo + " " + hi);
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return indexOf(a, key, lo, mid - 1, level + " ");
        } else if (key > a[mid]) {
            return indexOf(a, key, mid + 1, hi, level + " ");
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        String mode = "-";

        if (args.length > 0) {
            mode = args[1];
        }

        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (mode.equals("-")) {
                if (indexOf(whitelist, key) == -1) {
                    StdOut.println(key);
                }
            } else {
                if (indexOf(whitelist, key) != -1) {
                    StdOut.println(key);
                }
            }
        }
    }
}


