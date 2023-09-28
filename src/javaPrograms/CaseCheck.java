package src.javaPrograms;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Character is Lowercase");
        } else {
            System.out.println("Character is Uppercase");
        }
    }
}
