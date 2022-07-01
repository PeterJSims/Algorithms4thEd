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
}
