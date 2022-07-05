package leetcode;

public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)); // 5
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3)); // 2
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[--n];
            }
        }
        return n;
    }
}
