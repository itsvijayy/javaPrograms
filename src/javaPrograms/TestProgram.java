package src.javaPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class TestProgram {

    public static int minElementsToRemove(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements of array A to HashSet
        for (int num : A) {
            set.add(num);
        }

        int count = 0;
        // Count elements from array B that are already present in the HashSet
        for (int num : B) {
            if (set.contains(num)) {
                count++;
            }
        }

        // Minimum number of elements to remove is the count of common elements
        return count;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int[] B1 = {2, 3, 4, 5, 8};
        System.out.println("Output for A1 and B1: " + minElementsToRemove(A1, B1)); // Output: 3

        int[] A2 = {4, 2, 4, 4};
        int[] B2 = {4, 3};
        System.out.println("Output for A2 and B2: " + minElementsToRemove(A2, B2)); // Output: 1

        int[] A3 = {1, 2, 3, 4};
        int[] B3 = {5, 6, 7};
        System.out.println("Output for A3 and B3: " + minElementsToRemove(A3, B3)); // Output: 0

        int[] A4 = {0, 1, 0, 0};
        int[] B4 = {1, 0, 0};
        System.out.println("Output for A3 and B3: " + minElementsToRemove(A3, B3)); // Output: 0

        numberTable();
        fizzBuzzTest();
        palindromCheckTest();
    }

    public static void numberTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + n + "=" + i * n);

        }
    }

    public static void fizzBuzzTest() {
        /*
        Write a program that prints numbers from 1 to 100. However, for multiples of 3, print
        "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples
        of both 3 and 5, print "FizzBuzz."
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void palindromCheckTest() {
        /*
       Java Program to Check Palindrome String
         */
        String str = "Radar";
        int strLength = str.length();
        String reverseStr = "";

        for (int i = (strLength-1);i>=0; i--) {
            reverseStr = reverseStr + str.charAt(i);

        }
    }

}
