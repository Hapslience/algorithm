package algorithm;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 *For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *maxSubArray(A, i) = maxSubArray(A, i - 1) > 0 ? maxSubArray(A, i - 1) : 0 + A[i];

 */
public class MaxSubArray023 {
    public int maxSubArray(int[] nums){
        int t = nums.length;
        int[] dp=new int[t];
        dp[0]=nums[0];
        int max=dp[0];
        for (int i=1;i<t;i++){
            dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
            if(dp[i]>max) max = dp[i];
        }
        return max;
    }
}
