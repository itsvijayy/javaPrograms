package src.javaLearning.algorithms;

import java.util.Arrays;

public class LinearSearchAlgorithm_InStrings {

    public static void main(String[] args) {
        String str = "Hello World";
        char target = 'd';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(stringSearchUsingForLoop(str, target));
        System.out.println(stringSearchUsingForEachLoop(str, target));

    }

    // run a for loop
    static boolean stringSearchUsingForLoop(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean stringSearchUsingForEachLoop(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char character: str.toCharArray()) {
            if (character == target) {
                return true;
            }
        }
        return false;
    }
}
