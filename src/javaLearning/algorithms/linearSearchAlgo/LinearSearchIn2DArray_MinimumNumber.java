package src.javaLearning.algorithms.linearSearchAlgo;

import java.util.Arrays;

public class LinearSearchIn2DArray_MinimumNumber {
    public static void main(String[] args) {
        int[][] arr = {
                {23,55, 23},
                {12, 43, 54, 76},
                {29, 6, 89, 45, 99, 56},
                {56, 89, 45, 34, 123, 14, 2}
        };
        int target = 14;
        int[] ans = searchMinIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(searchMaxIn2DArray(arr));

    }

    /***
     * Search the minimum number in the 2D Array
     */

    static int[] searchMinIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[] {row, column};
                }
            }
        }
        return new int[] {-1, -1};
    }

    /***
     * Search the maximum number in the 2D Array
     */
    static int searchMaxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
