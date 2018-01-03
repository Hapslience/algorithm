package algorithm.arrayPratice;
/*
* Best Time to Buy and Sell Stock II
* Design an algorithm to find the maximum profit.
* You may complete as many transactions as you like
* (ie, buy one and sell one share of the stock multiple times).
* However, you may not engage in multiple transactions at the same time
* (ie, you must sell the stock before you buy again).
* */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for (int i=1;i<n;i++){
            if (prices[i]>prices[i-1]){
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}
