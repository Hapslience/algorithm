package algorithm.medium;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit.
 You may complete as many transactions as you like
 (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

 You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)

 Example:
 prices = [1, 2, 3, 0, 2]
 maxProfit = 3
 transactions = [buy, sell, cooldown, buy, sell]
 * */
public class MaxProfit {
    public int maxProfit(int[] prices){
        int t = prices.length;
        int[] buy = new int[t];
        int[] sell = new int[t];
        int[] rest = new int[t];
        buy[0] = -prices[0];
        rest[0] = 0;
        sell[0] = 0;

        for (int i=1;i<t;i++){
            buy[i] = Math.max(buy[i-1],rest[i-1]-prices[i]);
            sell[i] = Math.max(sell[i-1],buy[i-1]+prices[i]);
            int m = Math.max(buy[i-1],sell[i-1]);
            rest[i] = Math.max(m,rest[i-1]);
        }
        return sell[t-1];

//        for (int i=0;i<t;i++){
//            System.out.print(buy[i]);
//        }
//        System.out.println();
//        for (int i=0;i<t;i++){
//            System.out.print(sell[i]);
//        }
//        System.out.println();
//        for (int i=0;i<t;i++){
//            System.out.print(rest[i]);
//        }
//        return sell[t-1];
    }
//    public static void main(String[] args){
//        MaxProfit mp = new MaxProfit();
//        int[] prices = new int[]{1, 2, 3, 0, 2};
//        int p = mp.maxProfit(prices);
//        System.out.println(p);
//    }
}
