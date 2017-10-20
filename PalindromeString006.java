package algorithm;

public class PalindromeString006 {
    public boolean validPalindromeString(String s){
        int n = s.length();
        if(n==0) return true;
        for (int i=0;i<n/2+1;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return isPalindrome(s,i+1,n-i-1)||isPalindrome(s,i,n-i-2);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j){
        int n = s.length();
        for (int k=i;k<(i+j)/2+1;k++){
            if(s.charAt(k) != s.charAt(i+j-k)){
                return false;
            }
        }
        return true;
    }
}
