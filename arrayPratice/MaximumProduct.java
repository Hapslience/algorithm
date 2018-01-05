package algorithm.arrayPratice;

import java.util.Arrays;
/*
    Given an integer array,
    find three numbers whose product is maximum and output the maximum product.
 */
public class MaximumProduct {
    public int maximumProduct(int[] nums){
        Arrays.sort(nums);
        int t = nums.length;
        return Math.max(nums[t-1]*nums[t-2]*nums[t-3],nums[t-1]*nums[0]*nums[1]);

    }
    public int maximumProductT(int[] nums){
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int num:nums){
            if (num<min1){
                min2 = min1;
                min1 = num;
            }else if(num<min2){
                min2 = num;
            }
            if (num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if (num > max2){
                max3 = max2;
                max2 = num;
            }else if (num > max3){
                max3 = num;
            }
        }
        return Math.max(min1*min2*max1,max1*max2*max3);
    }
}
