package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber014 {
    //method one
    public int singleNumberMap(int[] nums){
        Map<Integer,Integer> m = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        return getKeyByValues(m,1);
    }
    public int getKeyByValues(Map<Integer,Integer> m , int val){
        int num = 0;
        for (Integer i:m.keySet()){
            if(m.get(i) == val){
                num = i;
            }
        }
        return num;
    }
    //method two
    public int singleNumber(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int count=0;
        int num = nums[0];
        for (int i=0;i<nums.length;i++){
            num = nums[i];
            count=0;
            for (int j=0;j<nums.length;j++){
                if (j==i)
                    continue;
                else{
                    if(num == nums[j]){
                        count++;
                        break;
                    }
                }
            }
            if(count==0){
                return num;
            }
        }
        return 0;
    }
}
