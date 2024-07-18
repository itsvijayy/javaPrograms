package src.javaLearning.programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*
            0, 1, 1, 2, 3, 5, 8, 13...
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number up to which Fibonacci series is to be printed: ");
        int N = scanner.nextInt();
        scanner.close();
        FibonnaciSeries(N);
    }

    public static void FibonnaciSeries(int number) {
        int first = 0, second = 1;
        System.out.print("Fibonnaci Series " + first + " " + second);

        int nextNumber;
        for (int i = 2; i < number; i++) {
            nextNumber = first + second;
            System.out.print(" " + nextNumber);
            first = second;
            second = nextNumber;
    }
}

}
