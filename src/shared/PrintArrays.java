package shared;

import edu.princeton.cs.algs4.StdOut;

public class PrintArrays {

    public static <T> void printGeneric2dArray(T[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            StdOut.print("____________");
        }
        StdOut.println("__");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String paddedI = String.format("%02d", i);
                String paddedJ = String.format("%02d", j);
                StdOut.print("| " + paddedI + ":" + paddedJ + ": " + arr[i][j]);
            }
            StdOut.println(" |");
        }
        for (int i = 0; i < arr[0].length; i++) {
            StdOut.print("------------");
        }
        StdOut.println("--");
    }

    public static void print2DintArray(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            StdOut.print("____________");
        }
        StdOut.println("__");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String paddedI = String.format("%02d", i);
                String paddedJ = String.format("%02d", j);
                String paddedItem = String.format("%03d", arr[i][j]);
                StdOut.print("| " + paddedI + ":" + paddedJ + ": " + paddedItem);
            }
            StdOut.println(" |");
        }
        for (int i = 0; i < arr[0].length; i++) {
            StdOut.print("------------");
        }
        StdOut.println("--");
    }


    public static void print2dBooleanArray(boolean[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            StdOut.print("____________");
        }
        StdOut.println("__");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String paddedI = String.format("%02d", i);
                String paddedJ = String.format("%02d", j);

                String label = arr[i][j] ? " * " : "   ";
                StdOut.print("| " + paddedI + ":" + paddedJ + ": " + label);
            }
            StdOut.println(" |");
        }
        for (int i = 0; i < arr[0].length; i++) {
            StdOut.print("------------");
        }
        StdOut.println("--");
    }
}

