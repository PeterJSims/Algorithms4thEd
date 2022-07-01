package ch01.part1.exercises;


import edu.princeton.cs.algs4.StdOut;

public class Ex13<T> {

    public static void main(String[] args) {
        boolean[][] arr = Ex11.generateRandom2DBooleanArr();
        Ex11.print2dBooleanArray(arr);
        arr = transpose(arr);
        StdOut.println("\n****************\n");
        Ex11.print2dBooleanArray(arr);
    }

    public static boolean[][] transpose(boolean[][] arr) {
        int newM = arr[0].length;
        int newN = arr.length;
        boolean[][] newArr = new boolean[newM][newN];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }
        return newArr;
    }
}
