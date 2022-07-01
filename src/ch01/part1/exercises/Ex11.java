package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex11 {
    public Ex11() {
    }

    public static void main(String[] args) {
        print2dBooleanArray(generateRandom2DBooleanArr());
    }


    public static void print2dBooleanArray(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String label = arr[i][j] ? " * " : "   ";
                StdOut.print(i + ":" + j + ": " + label);
            }
            StdOut.println();
        }
    }

    public static boolean[][] generateRandom2DBooleanArr() {
        int m = StdRandom.uniform(1, 8);
        int n = StdRandom.uniform(1, 8);
        boolean[][] arr = new boolean[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = StdRandom.bernoulli();
            }
        }
        return arr;
    }
}
