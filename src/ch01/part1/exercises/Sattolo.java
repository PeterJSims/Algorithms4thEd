package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Sattolo {

    public static void main(String[] args) {
        // had issue with int vs Int, cannot be primitive type if using Object
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        sattoloCycle(nums);
        StdOut.println(Arrays.toString(nums));
    }


    public static void sattoloCycle(Object[] arr) {
        int i = arr.length;
        while (i > 1) {
            i--;
            int j = StdRandom.uniform(i);
            Object temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }


}
