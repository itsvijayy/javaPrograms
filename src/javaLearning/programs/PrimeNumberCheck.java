package src.javaLearning.programs;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(isPrime(scanner.nextInt()));
    }

    /**
     * A prime number is a number that can only be divided by itself and 1 without remainder.
     */

    public static boolean isPrime(int num) {
        // If the number is less than 2, it is not prime
        if (num <= 1) {
            return false;
        }

        // create numbers from 2 till half inclusive of the num
        for (int i = 2; i <= num / 2; i++) {
            // try each number by using %
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /***
     * Time Complexity:
     * The program uses a loop that iterates from 2 to the square root of
     * the number (i <= Math.sqrt(num)).
     * In the worst case, the loop iterates for all numbers up to the square root,
     * which is roughly sqrt(n) times.
     * Therefore, the time complexity of this algorithm is considered O(sqrt(n)).
     *
     *
     * Space Complexity:
     * The program only uses a constant amount of extra space for variables
     * like i and the flag for primality.
     * This space complexity does not depend on the input size and remains constant.
     * Hence, the space complexity of this algorithm is O(1).
     */
}
