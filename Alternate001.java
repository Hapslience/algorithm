package algorithm;
public class Alternate001 {
    public void reverrange(int[] arr,int n){
        int temp = 0;
        int j=0;
        for (int i=0;i<n;i++){
            if(arr[i]<0){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(j);

        int pos = 0;
        while (j<n && arr[pos]<0){
            temp = arr[j];
            arr[j] = arr[pos];
            arr[pos] = temp;
            j++;
            pos+=2;
        }

    }
    public static void printArr(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int[] arr  = new int[]{-1, -2, -3, 4, -5, -6, -7, 8, 9};
        Alternate001 alt = new Alternate001();
        int n = arr.length;
        alt.reverrange(arr,n);
        Alternate001.printArr(arr);
    }
}
