package algorithm;

public class MaxRepeatedSubarray019 {
//    public int maxinumRepeatedSubarry(int[] A,int[] B){
//        int al = A.length;
//        int bl = B.length;
//        int max = 0;
//        int maxr=0;
//        for (int i=0;i<al;i++){
//            int tmp = A[i];
//            for (int j=0;j<bl;j++){
//                if(tmp == B[j]){
//                    max = 0;
//                    int k =i;
//                    int m = j;
//                    while (A[k]==B[m]){
//                        k++;
//                        m++;
//                        max++;
//                        if (k>=al || m>=bl) break;
//                    }
//                    if(maxr<max) maxr = max;
//                }
//            }
//        }
//        return maxr;
//    }

    /**
     * Given two integer arrays A and B,
     * return the maximum length of an subarray that appears in both arrays.
     */
    //Dynamic Programming
    public int maxinumRepeatedSubarry(int[] A,int[] B){
        int al = A.length;
        int bl = B.length;
        int ans = 0;
        int[][] mm = new int[al+1][bl+1];
        for (int i=al-1;i>=0;i--){
            for (int j=bl-1;j>=0;j--){
                if (A[i] == B[j]){
                    mm[i][j] = mm[i+1][j+1]+1;
                }
                if(ans < mm[i][j]) ans = mm[i][j];
            }
        }
        return ans;
    }
}
