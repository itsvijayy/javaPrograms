package src.javaPrograms;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        /*
            0, 1, 1, 2, 3, 5, 8, 13...ee9io
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}