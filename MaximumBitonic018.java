package algorithm;

/**
 * Given an array A[0 … n-1] containing n positive integers,
 * a subarray A[i … j] is bitonic if there is a k with i <= k <= j
 * such that A[i] <= A[i + 1] ... <= A[k] >= A[k + 1] >= .. A[j – 1] > = A[j].
 * Write a function that takes an array as argument and returns the length of
 * the maximum length bitonic subarray.
 * Expected time complexity of the solution is O(n)
 */
public class MaximumBitonic018 {
    public static int maxinumBitonic(int[] nums){
        int n=nums.length;
        int[] lef = new int[n];
        int[] rig = new int[n];
        lef[0]=1;
        rig[n-1]=1;
        for (int i=1;i<n;i++){
            lef[i]= nums[i]>nums[i-1]?lef[i-1]+1:1;
        }
        for (int i=n-2;i>=0;i--){
            rig[i] = nums[i]>nums[i+1]?rig[i+1]+1:1;
        }
        int max = lef[0]+rig[0]-1;
        for (int i=1;i<n;i++){
            if (max<(lef[i]+rig[i]-1))
                max = lef[i]+rig[i]-1;
        }
        return max;
    }
}
