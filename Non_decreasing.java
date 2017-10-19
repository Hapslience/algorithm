package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Non_decreasing {
    public int checkArr(int[] num,int n){
        for(int i=1;i<n;i++){
            if(num[i-1]>num[i]){
                if(i-2<0 || num[i-2]<num[i]){
                    return i-1;
                }
                return i;
            }

        }
        return -1;
    }
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int k = checkArr(nums,n);
        if(k==-1){
            return true;
        }else{
            int[] num = new int[n-1];
            for(int i=0;i<n-1;i++){
                if(i<k){
                    num[i] = nums[i];
                }else{
                    num[i] = nums[i+1];
                }
            }
            int s= num.length;
            int c = checkArr(num,s);
            if(c==-1)
                return true;
            else{
                return false;
            }

        }
    }
    public static void main(String[] args){
        Non_decreasing n = new Non_decreasing();
        int[] nums = new int[]{4,2,1};
        System.out.println(n.checkPossibility(nums));
    }
}
