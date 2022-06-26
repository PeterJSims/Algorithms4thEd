package ch01.part1.exercises;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class BooleanArrayPrinter {

    public static void main(String[] args) {
        boolean[][] arr = generateRandomBooleanArray(3, 5);
//        for (boolean[] row : arr) {
//            StdOut.println(Arrays.toString(row));
//        }
        printBooleanArray(arr);
    }

    public static boolean[][] generateRandomBooleanArray(int rows, int cols) {
        boolean[][] arr = new boolean[rows][cols];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = StdRandom.bernoulli();
            }
        }
        return arr;
    }

    public static void printBooleanArray(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            StdOut.print("| ");
            for (int j = 0; j < arr[0].length; j++) {
                String s = arr[i][j] ? " * " : "   ";
                StdOut.print(i + "." + j + ":" + s);
            }
            StdOut.print(" |\n");
        }
    }


}
