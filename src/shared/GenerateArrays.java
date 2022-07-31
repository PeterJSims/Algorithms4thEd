package shared;

import edu.princeton.cs.algs4.StdRandom;

public class GenerateArrays {

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

    public static int[] generate1dIntArr(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = StdRandom.uniform(n);
        }
        return nums;
    }

    public static double[] generate1dDoublesArr(int n) {
        double[] doubles = new double[n];
        for (int i = 0; i < n; i++) {
            doubles[i] = StdRandom.uniform(0.0, 1.0);
        }
        return doubles;
    }
}
