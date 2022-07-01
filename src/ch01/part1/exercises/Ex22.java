package ch01.part1.exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex22 {

    public static int indexOf(int[] a, int key, boolean printChoice) {
        return indexOf(a, key, 0, a.length - 1, "", printChoice);
    }

    public static int indexOf(int[] a, int key, int lo, int hi, String level, boolean printChoice) {
        if (printChoice) {
            StdOut.println(level + lo + " " + hi);
        }

        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return indexOf(a, key, lo, mid - 1, level + " ", printChoice);
        } else if (key > a[mid]) {
            return indexOf(a, key, mid + 1, hi, level + " ", printChoice);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        StdOut.println("Do you want to show the depth level? Yes/No");
        String choice = StdIn.readString();
        boolean yesOrNo = choice.equalsIgnoreCase("yes");

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (indexOf(whitelist, key, yesOrNo) == -1) {
                StdOut.println(key);
            }
        }

    }
}
