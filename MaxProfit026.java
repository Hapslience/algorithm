package algorithm;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * Input: [7, 1, 5, 3, 6, 4] Output: 5
 * max. difference = 6-1 = 5
 */
public class MaxProfit026 {
    public int maxProfit(int[] nums){
        int t = nums.length;
        if(t==0) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0;i<t;i++){
            if (nums[i]<minPrice) minPrice = nums[i];
            else {
                int temp = nums[i]-minPrice;
                maxProfit = temp>maxProfit?temp:maxProfit;
            }
        }
        return maxProfit;
    }
}
