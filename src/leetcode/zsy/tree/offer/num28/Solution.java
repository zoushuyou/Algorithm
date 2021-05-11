package leetcode.zsy.tree.offer.num28;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-11 10:22
 */
public class Solution {
/*    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }

        if (left != null && right != null && left.val == right.val){
           return dfs(left.left,right.right) && dfs(left.right,right.left);
        }else {
            return false;
        }
    }*/

    public boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null || left.val != right.val ){
            return false;
        }
        return recur(left.left,right.right) && recur(left.right,right.left);
    }
}
