package src.javaConcepts;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
            Program for nested Switch cases
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Emp ID: ");
        int empId = in.nextInt();
        System.out.print("Enter Department: ");
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Ram");
            case 2 -> System.out.println("Krishna");
            case 3 -> {
                System.out.print("Employee ID 3: ");
                switch (department) {
                    case "CS" -> System.out.println("Computer Science");
                    case "EEE" -> System.out.println("Electrical & Elcteronics Engineering");
                    case "ME" -> System.out.println("Mechanical Engineering");
                    default -> System.out.println("Invalid Department!");
                }
            }
            default -> System.out.println("Invalid EmpID");
        }
    }
}
