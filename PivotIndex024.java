package algorithm;

public class PivotIndex024 {
    public int pivotIndex(int[] nums) {
        int t =nums.length;
        for (int i=0;i<t;i++){
            int sum1=0,sum2=0;
            for (int j=0;j<i;j++){
                sum1+=nums[j];
            }
            for (int k=i+1;k<t;k++){
                sum2+=nums[k];
            }
            if(sum1 == sum2){
                return i;
            }
        }
        return -1;
    }

    /**
     * Prefix Sum (数组前缀和)
     * 用一个数组记录前 i 项的和，然后比较 sum[i]-nums[i] =？sum[n-1]-sum[i]
     * @param nums
     * @return
     */
    public int pivotIndexPrefixSum(int[] nums){
        int t = nums.length;
        if(t==0) return -1;
        int[] sum = new int[t];
        sum[0]=nums[0];
        for (int i=1;i<t;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        for (int i=0;i<t;i++){
            int temp =sum[i]-nums[i];
            if (temp== sum[t-1]-sum[i])
                return i;
        }
        return -1;
    }
}
