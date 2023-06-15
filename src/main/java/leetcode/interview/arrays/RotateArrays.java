package leetcode.interview.arrays;

/**
 * Description: Write a function that rotates an array of integers by a given number of steps to the right.
 * For example, given the array [1, 2, 3, 4, 5] and the number of steps as 2, the output should be [4, 5, 1, 2, 3].
 */
public class RotateArrays {

    public static int[] rotate(int arr[], int d, int n) {
        int temp[] = new int[n];
        int k = 0;

        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}
