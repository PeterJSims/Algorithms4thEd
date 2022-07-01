package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;
import shared.GenerateArrays;

import java.util.Arrays;
import java.util.HashMap;

public class Ex15 {

    public static void main(String[] args) {
        int[] randInts = GenerateArrays.generate1dIntArr(20);
        int[] notRandInts = {0, 0, 0, 1, 1, 1, 2, 2, 2, 4, 4, 4, 4,};
        StdOut.println(Arrays.toString(randInts));
        randInts = histogram(randInts, randInts.length);
        StdOut.println(Arrays.toString(randInts));
        StdOut.println();
        StdOut.println(Arrays.toString(notRandInts));
        notRandInts = histogram(notRandInts, 5);
        StdOut.println(Arrays.toString(notRandInts));
    }

    public static int[] histogram(int[] arr, int m) {
        int[] histArr = new int[m];
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int n : arr) {
            counts.put(n, 1 + counts.getOrDefault(n, 0));
        }
        for (int i = 0; i < m; i++) {
            histArr[i] = counts.getOrDefault(i, 0);
        }
        return histArr;
    }
}
