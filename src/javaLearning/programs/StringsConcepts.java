package src.javaLearning.programs;

import java.util.ArrayList;

public class StringsConcepts {
    public static void main(String[] args) {
        String a = "Test";
        String b = "Test";
        System.out.println(a == b);

        String c = new String("Test123");
        String d = new String("Test123");
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(2);

        /*
            Pretty formatting in Strings
        */
        float floatNum = 2433.4343534334f;
//        System.out.printf("Formatted number is %.2f",floatNum);

//        System.out.println(Math.PI);

//        System.out.printf("Hello my name is %s and I am %s", "Test", "Cool");

        System.out.println("Test123" + new ArrayList<>());


    }


}
