package algorithm.medium;

import java.util.Arrays;

public class FindTargetSumWays {
    //method one
    int count;
    public int findTargetSumWays(int[] nums,int target){
        count = 0;
        calculation(nums,0,0,target);
        return count;
    }
    public void calculation(int[] nums,int left,int sum,int targrt){
        if(left==nums.length){
            if(sum==targrt){
                count++;
            }
        }else{
            calculation(nums,left+1,sum+nums[left],targrt);
            calculation(nums,left+1,sum-nums[left],targrt);
        }
    }
    //method two
    public int findTargetSumWaysTwo(int[] nums, int target){
        int[][] mem = new int[nums.length][2002];
        for (int[] i :
                mem) {
            Arrays.fill(i,Integer.MIN_VALUE);
        }
        cal(nums,0,0,mem,target);

        return mem[nums.length][target+1000];
    }
    public int cal(int[] nums,int i,int sum,int[][] mem,int target){
        if(i==nums.length){
            if (sum==target)return 1;
            else{
                return 0;
            }
        }else{
            if(mem[i][sum+1000]!=Integer.MIN_VALUE)return mem[i][sum+1000];
            int add = cal(nums,i+1,sum+nums[i],mem,target);
            int sub = cal(nums,i+1,sum-nums[i],mem,target);
            mem[i][sum+1000] = add+sub;
            return mem[i][sum+1000];
        }
    }
    public static void main(String[] args){
        FindTargetSumWays ft = new FindTargetSumWays();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        ft.count = ft.findTargetSumWaysTwo(nums ,3);
        System.out.println(ft.count);

    }
}
