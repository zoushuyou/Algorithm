package leetcode.zsy.tree.num700;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-27 17:33
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null){
            return null;
        }
        if (root.val == val){
            return root;
        }
        TreeNode left = searchBST(root.left, val);
        TreeNode right = searchBST(root.right, val);

        if (left != null){
            return left;
        }else if (right != null){
            return right;
        }

        return null;
    }


/*    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || val == root.val) return root;

        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }*/

}
