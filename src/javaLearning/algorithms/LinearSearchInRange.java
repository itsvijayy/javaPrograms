package src.javaLearning.algorithms;

public class LinearSearchInRange {
    public static void main(String[] args) {

        int[] arr = {3, 4, 6 ,1, 7, 8, 2};
        int target = 7;
        System.out.println(linearSearchInIndexRange(arr, target, 1, 5));
    }

    /***
     * Problem statement ->
     * arr = [3, 4, 6 ,1, 7, 8, 2]
     * Search the element 7 in the range of index 1 to 5
     */
    static int linearSearchInIndexRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;

    }
}
