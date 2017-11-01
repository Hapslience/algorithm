package algorithm;

/**
 * Given a sorted array of positive integers,
 * rearrange the array alternately i.e first element should be maximum value,
 * second minimum value, third second max, fourth second min and so on.
 */
public class Rearrange016 {
    //method01
    public int[] rearrange(int[] nums,int n){
        int[] arr = new int[n];
        int small=0,large = n -1;
        boolean flag = true;
        for (int i=0;i<n;i++){
            if(flag) {
                arr[i] = nums[large];
                large--;
            }
            else {
                arr[i] = nums[small];
                small++;
            }
            flag=!flag;
        }
        return arr;
    }
    //method02
    public void rearrange01(int[] nums,int n){
        int max=n-1,min=0;
        int max_num = nums[max]+1;
        for (int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=nums[i]+(nums[max]%max_num)*max_num;
                max--;
            }else{
                nums[i]=nums[i]+(nums[min]%max_num)*max_num;
                min++;
            }
        }
        for (int i=0;i<n;i++){
            nums[i] = nums[i]/max_num;
            System.out.print(nums[i]+ " " );
        }
    }
}
