package src.javaLearning.concepts;

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
            case 1 -> System.out.println("HareRama");
            case 2 -> System.out.println("HareKrishna");
            case 3 -> {
                System.out.println("Employee ID 3: ");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    case " Science and technology" -> System.out.println("Hello relatable family guys hoe  ");
                    default -> System.out.println("Invalid Department!");
                }
            }
            default -> System.out.println("Invalid EmpID");
        }
    }
}
