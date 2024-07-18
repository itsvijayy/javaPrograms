package src.javaLearning.programs;


public class ReverseString {

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("Input String is: " + input);
        String reverseOptimised = reverseNumberOptimised(input);
        System.out.println("Optimised Reversed String is: " + reverseOptimised);

        String reverseString = reverseString(input);
        System.out.println("Reversed String is: " + reverseString);
    }

    public static String reverseNumberOptimised(String input) {
        StringBuilder reverseString = new StringBuilder(input);
        reverseString.reverse();
        return reverseString.toString();
        /***
         * Time Complexity -> O(n) where n is the length of the input string,
         * as the reverse() method still needs to traverse the string once.
         *
         * Space Complexity -> O(n) because StringBuilder requires additional space proportional to the length
         * of the input string. However, it is more memory efficient compared to using a char array since
         * StringBuilder is optimized for such operations.
         */
    }

    public static String reverseString(String input) {
        // Convert the input String into char Array
        char[] charArray = input.toCharArray();

        // initialise pointers from the Start and the end of the array
        int left = 0;
        int right = charArray.length - 1;

        // swap the characters from the start & end until the pointer meets
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers to the center
            left++;
            right--;

        }

        // convert the char back to the String
        return new String(charArray);

        /***
         * Time Complexity
         * The time complexity of this function is O(n), where n is the length of the input string. This is because the function iterates through
         * the string once, swapping characters from the start and end until the middle of the
         * string is reached.
         *
         *
         * Space Complexity
         * The space complexity of this function is O(n) as well. This is because we convert the
         * input string to a char array, which requires additional space proportional to the length
         * of the string. Apart from that, a few extra variables are used, but their space requirement
         * is constant, i.e. O(1)
         */
    }


}
