package leetcode.zsy.tree.num814;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-23 10:53
 */
public class Solution {

    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null;
    }

    private boolean containsOne(TreeNode node) {
        if (node == null){
            return false;
        }
        boolean l = containsOne(node.left);
        boolean r = containsOne(node.right);

        if (!l){
            node.left = null;
        }
        if (!r){
            node.right = null;
        }

        return node.val == 1 || l || r;
    }


}
