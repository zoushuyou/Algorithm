package leetcode.zsy.tree.num404;

import basic.zsy.tree.TreeNode;

public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    private int dfs(TreeNode root) {
        int ans = 0;
        if (root.left != null){
            ans += isLeafNode(root.left) ? root.left.val : dfs(root.left);
        }
        if (root.right != null && !isLeafNode(root.right)){
            ans += dfs(root.right);
        }
        return ans;
    }

    private boolean isLeafNode(TreeNode left) {
        return left.left == null && left.right == null;
    }

}
