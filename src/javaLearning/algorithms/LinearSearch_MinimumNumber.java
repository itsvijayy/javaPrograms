package src.javaLearning.algorithms;

public class LinearSearch_MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 6, 2, 34, 65, 1, 0};
        System.out.println(minimumNumber(arr));
    }

    /***
     * Assume my arr != 0
     * return the minimum value in the array
     * @return
     */
    static int minimumNumber(int[] arr) {
        // let's assume my first element is the smallest one
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
