package algorithm;

import java.util.*;

/**
 * Given a non-empty array of non-negative integers nums,
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 * that has the same degree as nums.
 */
public class DegreeOfArray021 {
    public int findShortestSubArray(int[] nums) {
        // left is used to record element's first location; right is used to record element's last location
        //count is used to record element's frequency of occurrence
        Map<Integer,Integer> left=new HashMap<Integer, Integer>(),
                             right = new HashMap<Integer, Integer>(),
                             count =new HashMap<Integer, Integer>();
        int t= nums.length;
        for (int i=0;i<t;i++){
            int x = nums[i];
            if (left.get(x)==null) left.put(x,i);
            right.put(x,i);
            count.put(x,count.getOrDefault(x,0)+1);
        }
        int max = Collections.max(count.values());

        //print max Value
        System.out.println(max);

        int ans = t;
        for (int i:count.keySet()){
            if(count.get(i) == max){
                int z = right.get(i)-left.get(i)+1;
                ans = ans >z?z:ans;
            }
        }
        return ans;
    }
}
