package leetcode.studyplan.algorithmI.easy;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[count++] = i;
            }
        }

        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}