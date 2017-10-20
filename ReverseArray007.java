package algorithm;

public class ReverseArray007 {
    /**
     * method one
     */
    public void reverseArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] =arr[n-i-1];
            arr[n-1-i] =temp;
        }
    }
    /**
     * method two
     */
    public void reverseArrayT(int[] arr, int start ,int end){
        if(start>end) return;
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayT(arr,start+1,end-1);
    }
    public static void main(String[] args){
        ReverseArray007 ra = new ReverseArray007();
        int[] arr = new int[]{0,1,2,3,4,5};
        int n = arr.length;
        Utils.printArray(arr,n);
        ra.reverseArrayT(arr,0,n-1);
        Utils.printArray(arr,n);
    }
}
