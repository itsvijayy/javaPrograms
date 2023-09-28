package src.javaPrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        /*
            Program to fetch the largest number
         */
        firstLogic();
        secondLogic();
        thirdLogic();
    }

    public static void firstLogic() {
        // Logic 1
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int largestNumber = a;

        if (b > largestNumber) {
            largestNumber = b;
        }
        if (c > largestNumber) {
            largestNumber = c;
        }
        System.out.println("Largest number is " + largestNumber);

    }

    public static void secondLogic() {
        // Logic 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maxNumber = 0;
        if (a > b) {
            maxNumber = a;
        } else {
            maxNumber = b;
        }
        if (c > a) {
            maxNumber = c;
        }
        System.out.println("Max Number is: " + maxNumber);
    }

    public static void thirdLogic() {
        // Logic 3
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = 0;
        max = Math.max(c, Math.max(a, b));
        System.out.print("Largest number is: " + max);
    }
}
