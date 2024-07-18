package src.javaLearning.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrograms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        // Taking the input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Output -> 1st approach
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] +  " ");
//            }
//            System.out.println();
//        }

        // Output -> 2nd approach ()
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }

        // Output -> 3rd approach (ForEach loop)
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        columnNoFixed();
    }

    /*
        Arrays program when column is not fixed
     */
    public static void columnNoFixed() {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }




}
