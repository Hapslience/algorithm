package algorithm;

/**
 * to determine whether an integer is a palindrome
 */
public class PalindromeNumber005 {
    public boolean isPalindrome(int x){
        if(x<0 || (x!=0 && x%10==0)) return false;
        int reverseNumber = 0;
        while (x>reverseNumber){
            reverseNumber = reverseNumber*10+x/10;
            x=x/10;
        }
        return reverseNumber==x || x==reverseNumber/10;
    }
}
