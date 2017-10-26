package algorithm;

/**
 * Given a non-negative integer c,
 * your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 */
public class JudgeSquareSum012 {
    public boolean judgeSquare(int c){
        if(c<0) return false;
        if(c==0) return true;
        int m = (int)Math.sqrt(c)+1;
        for (int i=1;i<m;i++){
            int s = c-i*i;
            double  k = Math.sqrt(s);
            int kk = (int)Math.sqrt(s);
            if(kk==k){
                return true;
            }
        }
        return false;
    }
}
