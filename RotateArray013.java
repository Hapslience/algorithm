package algorithm;

public class RotateArray013 {
    //methods one
    public void rotateArray(int[] arr,int k){
        k = k % arr.length;
        int count = 0;
        for(int start=0; count<arr.length;start++){
            int current = start;
            int pre = arr[start];
            do {
                int next = (current+k)%arr.length;
                int tmp = arr[next];
                arr[next] = pre;
                pre = tmp;
                current =next;
                count++;
            }while (start != current);
        }
    }
    //methods two
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
