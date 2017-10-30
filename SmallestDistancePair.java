package algorithm;

public class SmallestDistancePair {
    public int smallestDistancePair(int[] nums){
        int n = nums.length;
        int tmp = 1000;
        for (int i =0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int k = nums[i]-nums[j];
                if(k<0) k = -k;
                if(tmp>k)
                    tmp = k;
            }
        }
        return tmp;
    }
    public static void main(String[] args){
        SmallestDistancePair sp = new SmallestDistancePair();
        int[] arr = new int[]{1,2,1};
        int k = sp.smallestDistancePair(arr);
        System.out.println(k);
    }
}
