package algorithm.medium;

/**
 * Given an array which consists of non-negative integers and an integer m,
 * you can split the array into m non-empty continuous subarrays.
 * Write an algorithm to minimize the largest sum among these m subarrays.
 * Input:
 * nums = [7,2,5,10,8]
 * m = 2
 * Output:
 * 18
 * Explanation:
 * There are four ways to split nums into two subarrays.
 * The best way is to split it into [7,2,5] and [10,8],
 * where the largest sum among the two subarrays is only 18.
 */
public class SplitArray {
    public int splitArray(int[] nums,int m){
        int max=0;
        int sum=0;
        for (int num:nums){
            sum+=num;
            max=num>max?num:max;
        }
        if (m==1) return sum;
        int l=max;
        int r=sum;
        while (l<=r){
            int middle = (l+r)/2;
            if(valid(nums,m,middle)){
                r=middle-1;
            }else{
                l=middle+1;
            }
        }
        return l;
    }
    public boolean valid(int[] nums,int m,int middle){
        int target = 0;
        int count =1;
        for (int num:nums){
            target+=num;
            if (target>middle){
                target=num;
                count++;
                if (count>m){
                    return false;
                }
            }
        }
        return true;
    }
}
