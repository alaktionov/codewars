package leetcode.studyplan.algorithmI.medium;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 */
public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (target == numbers[i] + numbers[j]) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[2];
    }
}