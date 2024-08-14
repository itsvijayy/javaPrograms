package src.javaLearning.algorithms.binarySearchAlgo;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        /***
         * Note: Array is already sorted here in ascending order
         */
        int[] arr = {-9, -4, 0, 2, 4, 8, 23, 64, 76, 88, 123};
        int target = -9;
        System.out.println(binarySearchAlgorithmConcept(arr, target));

    }

    // Write a program to find an element's index from an array using binary search
    static int binarySearchAlgorithmConcept(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex < endIndex) {
            // find the middle element
            /***
             * int mid = (start + end) / 2 -> might be possible that (start + end) exeecds the range of length of integer
             */
            int mid = startIndex + (endIndex - startIndex) / 2;

            if (target < arr[mid]) {
                endIndex = mid - 1;
            } else if (target > arr[mid]) {
                startIndex = mid + 1;
            } else {
                // answer
                return mid;
            }
        }
        return -1;
    }
}
