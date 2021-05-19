package leetcode.zsy.tree.offer.num68_2;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-19 9:17
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }

        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);

        return l == null ? r : (r == null ? l : root);
    }

}