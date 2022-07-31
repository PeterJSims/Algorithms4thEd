package ch01.part1.exercises;

import shared.PrintArrays;

public class Ex30 {

    public static void main(String[] args) {
        boolean[][] booleanArray = generateRelativePrimeArray(30);
        PrintArrays.print2dBooleanArray(booleanArray);

    }

    public static boolean[][] generateRelativePrimeArray(int m) {
        boolean[][] arr = new boolean[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (isRelativePrime(i, j)) arr[i][j] = true;
            }
        }
        return arr;
    }

    private static boolean isRelativePrime(int i, int j) {
        return euclid(i, j) == 1;
    }

    private static int euclid(int a, int b) {
        if (b == 0) return a;
        return euclid(b, a % b);
    }
}
