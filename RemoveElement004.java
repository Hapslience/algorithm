package algorithm;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 */
public class RemoveElement004 {
    public static int removeElement(int[] nums,int val){
        int n = nums.length;
        int begin = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[begin] = nums[i];
                begin++;
            }
        }
        return begin;
    }
}
