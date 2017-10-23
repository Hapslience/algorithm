package algorithm;

import java.util.*;

/**
 * The set S originally contains numbers from 1 to n. But unfortunately,
 * due to the data error, one of the numbers in the set got duplicated to another number in the set,
 * which results in repetition of one number and loss of another number.

 Given an array nums representing the data status of this set after the error.
 Your task is to firstly find the number occurs twice and then find the number that is missing.
 Return them in the form of an array.

 */

public class FindErrorNumber {
    /*
    method -1
     */
    public int[] findErrorNums(int[] arr){
        int mis=-1,dol=-1;
        int n = arr.length;
        for (int i=1;i<=n;i++){
            int num=0;
            for (int j=0;j<n;j++)
                if(arr[j]==i)
                    num++;
            if(num == 2){
                dol = i;
            }else if(num == 0){
                mis = i;
            }
        }
        return new int[]{dol,mis};
    }
    /*
    method 02
     */
    public int[] findErrorNums02(int[] arr){
        int n = arr.length;
        int dol=-1,mis=1;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                dol = arr[i];
            }else if(arr[i]> arr[i-1]+1){
                mis = arr[i-1]+1;
            }
        }
        return  new int[]{dol,arr[n-1]!=n?n:mis};
    }
    public static void main(String[] args){
        Map m =new HashMap();
        FindErrorNumber f = new FindErrorNumber();
        int[] arr = new int[]{1,2,4,2};
        int[] s= f.findErrorNums(arr);
        System.out.println(s[0]+" "+s[1]);
        System.out.println(s);

    }
}
