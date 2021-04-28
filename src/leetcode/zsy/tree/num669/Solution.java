package leetcode.zsy.tree.num669;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-28 9:32
 */
public class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return root;
        }
        if (root.val < low){
            return trimBST(root.right,low,high);
        }
        if (root.val > high){
            return trimBST(root.left,low,high);
        }

        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right, low,high);
        return root;
    }
}
