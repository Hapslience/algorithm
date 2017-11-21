package algorithm;

public class SearchInsert022 {
    public int searchInsert(int[] nums,int target){
        int t = nums.length;
        int conut = 0;
        for (int i =0;i<t;i++){
            if(target>=nums[i]){
                if(target ==nums[i]){
                    conut=i;
                    return conut;
                }
            }else{
                conut=i;
                return conut;
            }
        }
        return t;
    }
    public int searchInsert01(int[] nums,int target){
        int low = 0,high = nums.length;
        while (low<high){
            int mid = (low+high)/2;
            if(nums[mid]<target) low=mid+1;
            else if(nums[mid]==target) return mid;
            else  high = high-1;
        }
        return low;
    }
}
