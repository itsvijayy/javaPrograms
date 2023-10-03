package src.javaPrograms;

import java.util.Scanner;

public class isArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print(isArmstrong(n));
    }

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = (int) (sum + Math.cbrt(rem));
        }
        return sum == originalNumber;
    }
}
