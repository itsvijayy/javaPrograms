package src.javaLearning.leetcode;

public class EvenNumberDigit_1295 {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));

    }

    // function to check if a number is even or not
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check if the number is even or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    // count the number of the number
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    // optimised way to find number of digits
    static int optimisedDigits(int num) {
        return (int) (Math.log10(num)) + 1;
    }


}
