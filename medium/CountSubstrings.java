package algorithm.medium;

public class CountSubstrings {
    public int countSubstrings(String s){
        int n = s.length();
        int num =0;
        for (int i=0;i<2*n-1;i++){
            int left = i/2;
            int right = left+i%2;
            while (left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                num++;
                left--;
                right++;
            }
        }
        return num;
    }
}
