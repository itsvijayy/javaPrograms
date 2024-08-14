package src.javaLearning.leetcode;

public class MaxWealth_1672 {
    // https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        int[][] account = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(account));
    }

     static int maximumWealth(int[][] accounts) {
        // person = row
        // account = column
        int ans = Integer.MIN_VALUE;
         for (int[] person : accounts) {
             // when we start a new column, take a new sum for that row
             int sum = 0;
             for (int account : person) {
                 sum += account;
             }
             // now we have sum of accounts of person
             // check with overall ans
             if (sum > ans) {
                 ans = sum;
             }
         }
        return ans;
    }
}
