package leetcode.studyplan;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] squaredNums = new int[size];
        for (int i = 0; i < size; i++) {
            squaredNums[i] = nums[i] * nums[i];
        }

        Arrays.sort(squaredNums);
        return squaredNums;
    }
}