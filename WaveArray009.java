package algorithm;

public class WaveArray009 {
    // quickSortin
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
    public void wavefromArray(int[] arr,int n){
        quikSorting(arr,0,n-1);
        if(n%2==0){
            exchange(arr,0,n-1);
        }else{
            exchange(arr,0,n-2);
        }
    }
    public void exchange(int[] arr,int start,int end){
        if(start>end) return ;
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        exchange(arr, start+2,end-2);
    }
    public static void main(String[] args){
        WaveArray009 wa = new WaveArray009();
        int[] arr = new int[]{2,3,5,7,1,2,3,4,6,8,0};
        int n = arr.length;
        Utils.printArray(arr,n);
        wa.wavefromArray(arr,n);
        Utils.printArray(arr,n);
    }

}
