package src.javaPrograms;

public class RemoveCharacter {

    public static String removeCharacter(String input, char ch){
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ch) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        char ch = 'l';

        String modifiedString = removeCharacter(input, ch);
        System.out.println("Modified String: " + modifiedString);
    }

    /***
     * 
     * Time Complexity
     * The time complexity of the removeCharacter function is determined by the loop that iterates over each character of the input string.
     * The loop runs for n iterations, where n is the length of the input string.
     * Thus, the time complexity is 𝑂(𝑛) O(n)
     *
     * Space Complexity
     * The space complexity of the removeCharacter function is determined by the space used by the StringBuilder.
     *
     * The StringBuilder will store at most n characters (in the case where none of the characters are removed).
     * Thus, the space complexity is O(n).
     *
     * Summary
     * Time Complexity:
     * O(n)
     * Space Complexity:
     * O(n)
     */
}
