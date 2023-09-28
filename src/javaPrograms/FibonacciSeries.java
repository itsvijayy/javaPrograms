package src.javaPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    /*  Find the Fibonacci Series of nth number.
          0, 1, 1, 2, 3, 5, 8, 13...
      */
    public static void main(String[] args) {
        // Taking the input from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        //count will start from 2
        int count = 2;
        /*
            Logic ->
            sum of the two numbers i.e. current number and the previous number
         */
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The number at nth position is: " + b);
    }
}
