package algorithm;

public class MinCostClimbingStairs028 {
    public int minCostClimbingStairs(int[] cost){
        int t = cost.length;
        int[] p = new int[t];
        int[] np = new int[t];
        p[0] = cost[0];
        np[0] = 0;
        for (int i=1;i<t;i++){
            p[i] = cost[i]+Math.min(p[i-1],np[i-1]);
            np[i] = p[i-1];
        }
        return Math.min(p[t-1],np[t-1]);
    }
    public static void main(String[] args){
        MinCostClimbingStairs028 mc = new MinCostClimbingStairs028();
        int[] cost = new int[]{10, 15, 20};
        int  m = mc.minCostClimbingStairs(cost);
        System.out.println(m);
    }
}
