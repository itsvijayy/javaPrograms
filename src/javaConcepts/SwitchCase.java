package src.javaConcepts;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        switchStatement();
        enhancedSwitch();
    }

    public static void switchStatement() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruits = in.next();

        switch (fruits) {
            case "Apple":
                System.out.println("A for Apple");
                break;
            case "Banana":
                System.out.println("B for Banana");
                break;
            case "Carrot":
                System.out.println("C for Carrot");
                break;
            case "Doodle":
                System.out.println("D for Doodle");
                break;
            default:
                System.out.println("The input is invalid!!!");
        }
    }

    public static void enhancedSwitch() {
        Scanner in = new Scanner(System.in);
        /*
            Program for fruits name
         */
        System.out.print("Enter the fruit name: ");
        String fruits = in.next();

        switch (fruits) {
            case "Apple" -> System.out.println("A for Apple");
            case "Banana" -> System.out.println("B for Banana");
            case "Carrot" -> System.out.println("C for carrot");
            case "Doodle" -> System.out.println("D for doodle");
            default -> System.out.println("Invalid Input!!!");
        }

        /*
            Program for a weekend and weekdays
         */
        System.out.print("Enter the day: ");
        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid input!!!");
        }
    }
}
