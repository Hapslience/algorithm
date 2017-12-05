package algorithm.medium;

/**
 * Given a non negative integer number num.
 * For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation
 * and return them as an array.
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 */

public class CountBits {
    public int[] countBits(int num){
        int[] temp = new int[num+1];
        temp[0]=0;
        for (int i=1;i<num+1;i++){
            int flag = 0;
            if (i%2!=0) flag=1;
            temp[i]=temp[i/2]+flag;
        }
        return temp;
    }
}
