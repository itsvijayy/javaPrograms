package src.javaLearning.algorithms.binarySearchAlgo;

public class OrderAgnostic_BinarySearch {

    public static void main(String[] args) {
        int[] ascendingArray = {2, 4, 6, 12, 43, 65, 76, 90};
        int[] descendingArray = {100, 89, 78, 57, 34, 23, 11, 3};
        int targetAscending = 43;
        int targetDscending = 23;

        System.out.println(orderAgnosticBS(ascendingArray, targetAscending));
        System.out.println(orderAgnosticBS(descendingArray, targetDscending));

    }

    static int orderAgnosticBS(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

//        boolean isOrderAgnostic;
//        if (arr[startIndex] < arr[endIndex]) {
//            isOrderAgnostic = true;
//        } else {
//            isOrderAgnostic = false;
//        }

        // Shortcut of line number 13 to 18
        boolean isOrderAgnostic = arr[startIndex] < arr[endIndex];

        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isOrderAgnostic) {
                if (target < arr[mid]) {
                    endIndex = mid - 1;
                } else{
                    startIndex = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    endIndex = mid - 1;
                } else{
                    startIndex = mid + 1;
                }
            }

        }
        return -1;
    }

}
