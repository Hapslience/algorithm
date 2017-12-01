package algorithm;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing
 * each of them is that adjacent houses have security system connected
 * and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
    public int houseRobber(int[] nums){
        int max = 0;
        int t = nums.length;
        if(t==0) return 0;
        if(t==1) return nums[0];
        int[] dp = new int[t];
        dp[0]= nums[0];
        dp[1]= nums[0]>nums[1]?nums[0]:nums[1];
        for (int i=2;i<t;i++){
            int temp = nums[i]+dp[i-2];
            dp[i]=temp>dp[i-1]?temp:dp[i-1];
        }
        return dp[t-1];
    }
}
