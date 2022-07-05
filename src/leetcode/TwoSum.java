package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); // [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6))); // [1, 2]
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numIndexes.containsKey(target - nums[i])) {
                return new int[]{numIndexes.get(target - nums[i]), i};
            } else {
                numIndexes.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
