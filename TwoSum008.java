package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a Binary Search Tree and a target number,
 * return true if there exist two elements
 * in the BST such that their sum is equal to the given target.
 */
public class TwoSum008 {
    public boolean findTarget(TreeNode root, int target){
        Set<Integer> set = new HashSet<Integer>();
        return find(root,target,set);
    }
    public boolean find(TreeNode root, int k , Set<Integer> set){
        if(root==null) return false;
        if(set.contains(k-root.val))
            return true;
        set.add(root.val);
        return find(root.left,k,set)||find(root.right,k,set);
    }
}
