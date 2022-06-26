package ch01.part1.exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BinarySearch {

    private BinarySearch() {
    }

    public static int indexOf(int[] a, int key) {
        return indexOf(a, key, 0, a.length, "");
    }

    private static int indexOf(int[] a, int key, int low, int high, String level) {
        StdOut.println(level + low + " " + high);
        if (low >= high) {
            return -1;
        } else {
            int mid = low + (high - low) / 2;
            if (a[mid] < key) {
                return indexOf(a, key, mid + 1, high, level + " ");
            } else if (a[mid] > key) {
                return indexOf(a, key, low, mid - 1, level + " ");
            } else {
                return mid;
            }
        }
    }

    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();

        // Remove duplicates via adding items to set and turning set back into an array
        Set<Integer> numsSet = new HashSet<>();
        for (int i : allowlist) {
            numsSet.add(i);
        }
        Integer[] targetArray = numsSet.toArray(new Integer[0]);


        String plusOrMinus = args[1];

        // sort the array
        Arrays.sort(targetArray);

        // read integer key from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (plusOrMinus.equals("+")) {
                if (edu.princeton.cs.algs4.BinarySearch.indexOf(allowlist, key) == -1)
                    StdOut.println(key);
            } else {
                if (edu.princeton.cs.algs4.BinarySearch.indexOf(allowlist, key) != -1)
                    StdOut.println(key);
            }

        }


    }
}
