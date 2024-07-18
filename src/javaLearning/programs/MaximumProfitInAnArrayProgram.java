package src.javaLearning.programs;

public class MaximumProfitInAnArrayProgram {
    /***
     * The cost of a stock on each day is given in an array.
     * Find the maximum profit that you can make by buying and selling only once
     * Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
     * Output : Max profit : 655
     */

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Max profit: " + getMaxProfit(prices));
    }

    public static int getMaxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit; 
                }
            }
        }
        return maxProfit;
    }
}
