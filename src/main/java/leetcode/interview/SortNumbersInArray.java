package leetcode.interview;

import java.util.Arrays;

/**
 * Java program to sort integers in a given array
 * 2 5 -2 6 -3 8 0 -7 -9 4 -> -9 -7 -3 -2 0 2 4 5 6 8
 */
public class SortNumbersInArray {

    public static void sortNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}