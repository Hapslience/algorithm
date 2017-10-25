package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Depth First Search
 * 用一个List 记录 总数， 一个List记录个数。
 * 深度优先搜索，用一个数字记录层数，进行更新，如果是同一层，则相加更新。
 */
public class AverageLevels011 {

    public List<Double> averageOfLevels(TreeNode root){
        List<Double> res = new ArrayList<Double>();
        List<Integer> count = new ArrayList<Integer>();
        for (int i=0;i<res.size();i++){
            res.set(i,res.get(i)/count.get(i));
        }
        return res;

    }
    public void average(TreeNode root,int i,List<Double> res,List<Integer> count){
        if(root == null) return ;
        if(i<res.size()){
            res.set(i,res.get(i)+root.val);
            count.set(i,count.get(i)+1);
        }else{
            res.add(1.0*root.val);
            count.add(1);
        }
        average(root.left,i+1,res,count);
        average(root.right,i+1,res,count);

    }
}
