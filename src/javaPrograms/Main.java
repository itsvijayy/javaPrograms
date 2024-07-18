package src.javaPrograms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(21331314);
//        System.out.println("Vijay");
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter some input: ");
//        int rollNo = input.nextInt();
//        System.out.println("Your roll no is " + rollNo);
//
//        whileLoop();
        forLoop();
    }

    public static void whileLoop() {
        int count = 0;
        while (count <= 10) {
            System.out.println("The numbers: " + count);
            count++;
        }
    }

    public static void forLoop() {
//        for (int count = 0; count <= 10; count++) {
//            System.out.println(count);
//        }

        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();


        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
            System.out.println("Please follow me. (^_^)");
        }
    }

}