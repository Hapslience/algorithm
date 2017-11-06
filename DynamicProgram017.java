package algorithm;

/**
 * 0-1背包 ～dynamic program
 */
public class DynamicProgram017 {
    private static int[] weight;
    private static int[] value;
    private static int capacity;
    private static int[][] mm;
    private static int n; // n为物品的个数
    private static int[] aw;
    static{
        weight = new int[]{0,2,2,6,5,4};
        value = new int[]{0,6,3,5,4,6};
        capacity = 10;
        n = weight.length-1;
        aw = new int[n+1];
        mm = new int[weight.length][capacity+1];
    }
    private void getAnswer(int[][] mm,int n){
        int j =capacity;
        for (int i=1;i<n;i++){
            if(mm[i][j] == mm[i+1][j]) aw[i]=0;
            else{
                j = j-weight[i];
                aw[i]=1;
            }
        }
        if(aw[n] != mm[n][j]){
            aw[n]=1;
        }else aw[n]=0;
    }
    public void package_01(int[][] mm,int[] weight,int[] value,int n){
        for (int j=0;j<=capacity;j++){
            if(weight[n]>j)
                mm[n][j]=0;
            else
                mm[n][j]=value[n];
        }
        for (int i=n-1;i>0;i--){
                for (int j=0;j<=capacity;j++){
                    if (weight[i]>j)
                        mm[i][j] = mm[i+1][j];
                    else{
                        mm[i][j] = mm[i+1][j]>mm[i+1][j-weight[i]]+value[i]?mm[i+1][j]:mm[i+1][j-weight[i]]+value[i];
                    }
                }
        }
    }

    public static void printArray(int[][] mm){
        if (mm.length==0) return;
        for (int i=1;i<mm.length;i++){
            for (int j=1;j<mm[0].length;j++){
                System.out.printf("%2d\t",mm[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        DynamicProgram017 dp = new DynamicProgram017();

        dp.package_01(mm,weight,value,n);
        DynamicProgram017.printArray(mm);

        dp.getAnswer(mm,n);
        int i;
        for (i=1;i<=n;i++){
            System.out.print(aw[i]+" ");

        }
    }

}
