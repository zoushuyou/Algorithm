package leetcode.zsy.tree.num951;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-26 9:07
 */
public class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == root2){
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val){
            return false;
        }
        return (flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right) ||
                flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left));
    }
}
