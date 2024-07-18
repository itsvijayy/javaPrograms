package src.javaPrograms;

import java.util.StringJoiner;

public class MergeTwoStringsAlternatively {
    public static void main(String[] args) {
        mergeStrings("hello", "world");
        stringTest();
    }

    private static void mergeStrings(String one, String two) {
        String result = "";
        for (int i = 0; i < one.length() || i < two.length(); i++) {
            if (i < one.length())
                result += one.charAt(i);
            if (i < two.length())
                result += two.charAt(i);
        }
        System.out.println(result);
    }

    public static void stringTest() {
        String one = "hello";
        String two = "world";
        String result = one.concat(two);
        System.out.println(result);

        System.out.println( one + two);

        StringJoiner joiner = new StringJoiner("");
        joiner.add("Hello");
        joiner.add("Vj");
        joiner.add("How");
//        String result1 = joiner.toString();
//        System.out.println(result1);
        String result2 = joiner.toString();
        System.out.println(result2);
    }
}
