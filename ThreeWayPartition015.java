package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Dutch National Flag
 */

public class ThreeWayPartition015 {
    public void threeWayPartition(int[] nums,int lowVal,int highVal){
        int n = nums.length;
        int start = 0,end = n-1;
        for (int i=0;i<=end;){
            if(nums[i]<lowVal){
                int tmp = nums[start];
                nums[start] = nums[i];
                nums[i] =tmp;
                start ++;
                i++;
            }else if(nums[i]>highVal){
                int tmp = nums[end];
                nums[end] = nums[i];
                nums[i] = tmp;
                end--;
            }else
                i++;
        }
    }
}
