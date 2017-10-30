package algorithm;

public class ArrayPairSum {
    public void quikSorting(int[] arr,int left,int right){
        if(left<right) {
            int l = left;
            int r = right;
            int tmp = arr[left];
            while (left < right) {
                while (left < right && arr[right] >= tmp) {
                    right--;
                }
                arr[left] = arr[right];
                while (left < right && arr[left] < tmp) {
                    left++;
                }
                arr[right] = arr[left];
            }
            arr[left] = tmp;
            quikSorting(arr, l, left);
            quikSorting(arr, left + 1, r);
        }
    }

    public int arrayPairSum(int[] nums){
        quikSorting(nums,0,nums.length-1);
        int n = nums.length/2;
        if(nums.length==0) return 0;
        int sum = 0;
        for (int i=0;i<nums.length-1;i+=2){
            sum+=Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}
