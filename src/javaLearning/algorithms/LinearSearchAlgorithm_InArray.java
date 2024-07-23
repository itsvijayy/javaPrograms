package src.javaLearning.algorithms;

public class LinearSearchAlgorithm_InArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 12, 14, 13, 32, 54, 100};
        int target = 54;
        System.out.println(linearSearchWithForLoop(arr, target));
        System.out.println(linearSearchWithForEachLoop(arr, target));


    }

    /***
     * Search in the array, return the index if item found
     * otherwise, if item is not found then return -1
     */
    public static int linearSearchWithForLoop(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    public static int linearSearchWithForEachLoop(int[] arr, int target) {

        // run a for-each loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
