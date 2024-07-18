package src.javaPrograms;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        long factorial = factorialCheck(number);
        System.out.println("Factorial of " + number + " is " + factorial);

    }

    public static long factorialCheck(int n) {
       if (n < 0) {
           throw new IllegalArgumentException("Number should be non-negative");
       }

       long result = 1;
       for (int i =1; i <= n; i++){
           result *= i;
       }
       return result;
    }

    /***
     * Time Complexity
     * The time complexity of this program is O(n), where n is the input number.
     * This is because the program
     * uses a simple for loop that iterates from 1 to n, performing a constant-time multiplication
     * operation in each iteration.
     *
     * Space Complexity
     * The space complexity of this program is O(1), or constant space.
     * This is because the space required does not grow with the size of the input n.
     * The program uses a fixed amount of space to store the result and a few additional variables.
     */


}
