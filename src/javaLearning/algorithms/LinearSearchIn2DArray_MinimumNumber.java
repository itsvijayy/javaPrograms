package src.javaLearning.algorithms;

import java.util.Arrays;

public class LinearSearchIn2DArray_MinimumNumber {
    public static void main(String[] args) {
        int[][] arr = {
                {3,55, 23},
                {12, 43, 54, 76},
                {29, 6, 89, 45, 99, 56},
                {56, 89, 45, 34, 23, 14, 2}
        };
        int target = 2;
        int[] ans = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    /***
     * Search the minimum number in the 2D Array
     */

    static int[] searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[] {row, column};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
