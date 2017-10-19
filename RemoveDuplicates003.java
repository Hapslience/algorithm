package algorithm;

/**
 * nums is an Sorted Array
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        int n = nums.length;
        int total = 1;
        for (int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                total++;
            }
        }
        return total;
    }
    public  static void main(String[] args){
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = new int[]{1,1,2};
        int res =  rd.removeDuplicates(nums);
        System.out.println(res);
    }
}
