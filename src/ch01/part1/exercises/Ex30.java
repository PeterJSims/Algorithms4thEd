package ch01.part1.exercises;

public class Ex30 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] arr = generateArray(n);

        BooleanArrayPrinter.printBooleanArray(arr);
    }

    public static boolean[][] generateArray(int n) {
        boolean[][] arr = new boolean[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (Euclid.gcd(i, j) == 1) {
                    arr[i][j] = true;
                }
            }
        }
        return arr;
    }
}
