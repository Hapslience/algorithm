package algorithm.arrayPratice;
/*
Given an array nums,
write a function to move all 0's to the end of it
while maintaining the relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12],
after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int t = nums.length;
        int j=0;
        for (int i=0; i<t; i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }
        while (j<t){
            nums[j] = 0;
            j++;
        }
    }
    public void moveZeroesOne(int[] nums){
        int t = nums.length;
        for (int i=0, j=0; i<t; i++){
            if (nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
