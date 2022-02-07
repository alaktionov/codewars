package leetcode.studyplan;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        while (k > 0) {
            int last = nums[size - 1];
            for (int i = size - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
            k--;
        }
    }
}