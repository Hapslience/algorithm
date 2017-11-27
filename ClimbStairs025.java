package algorithm;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 */
public class ClimbStairs025 {
    //method one for climbStairs
    public int climbStairs(int n){
        int[] mem = new int[n+1];
        if(n==1) return 1;
        else if (n==2) return 2;
        else return climb_stairs(0,n,mem);
    }
    public int climb_stairs(int i,int b,int[] mem){
        if(i>b)return 0;
        if(i==b) return 1;
        if (mem[i]>0) return mem[i];
        mem[i] =climb_stairs(i+1,b,mem)+climb_stairs(i+2,b,mem);
        return mem[i];
    }
    //Dynamic Programming
    public int climbStairsForDynamic(int n){
        if (n==1)return 1;
        if (n==2)return 2;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
