package src.javaLearning.programs;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                // Addition
                if (op == '+') {
                    ans = num1 + num2;
                }

                // Substraction
                if (op == '-') {
                    ans = num1 - num2;
                }

                // Multiplication
                if (op == '*') {
                    ans = num1 * num2;
                }

                //Division
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }

                //Remainder
                // Multiplication
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!!");
            }
            System.out.println(ans);
        }
    }

}
