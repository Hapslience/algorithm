package algorithm.medium;

/**
 Now your task is to find the maximum number of strings that you can form with given m 0s and n 1s.
 Each 0 and 1 can be used at most once.
 Note:
 The given numbers of 0s and 1s will both not exceed 100
 The size of given string array won't exceed 600.
 Example 1:
 Input: Array = {"10", "0001", "111001", "1", "0"}, m = 5, n = 3
 Output: 4
 */
public class FindMaxForm {
    public int findMaxForm(String[] strs,int m,int n){
        int[][] nums = new int[m+1][n+1];
        for (String s:strs){
            int mm =0;
            int nn=0;
            byte[] bytes = s.getBytes();
            for (byte b : bytes){
                if (b=='0')mm++;
                if (b=='1')nn++;
            }
            for (int i=m;i>=mm;--i){
                for (int j=n;j>=nn;--j){
                    nums[i][j] = Math.max(nums[i][j],nums[i-mm][j-nn]+1);
                }
            }
        }
        return nums[m][n];
    }
}
