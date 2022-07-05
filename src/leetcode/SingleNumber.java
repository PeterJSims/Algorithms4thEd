package leetcode;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1})); // 1
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2})); // 4
    }

    public static int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique = num ^ unique;
        }
        return unique;
    }
}
