package leetcode.zsy.tree.offer.num55_2;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-16 22:14
 */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if (Math.abs(recur(root.left) - recur(root.right) ) > 1){
            return false;
        }

        return isBalanced(root.left)  && isBalanced(root.right);
    }

    public int recur(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = recur(root.left) + 1;
        int right = recur(root.right) + 1;
        return Math.max(left , right);
    }
}
