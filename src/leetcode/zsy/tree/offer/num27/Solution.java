package leetcode.zsy.tree.offer.num27;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-11 9:54
 */
public class Solution {
    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return root;
        }
        TreeNode res = new TreeNode(root.val);
        dfs(res,root);
        return res;
    }

    public static void dfs(TreeNode res, TreeNode root) {
        if (root == null){
            return;
        }
        if (root.right != null){
            res.left = new TreeNode(root.right.val);
        }
        if (root.left != null){
            res.right = new TreeNode(root.left.val);
        }
        dfs(res.left,root.right);
        dfs(res.right,root.left);
    }

    public static void main(String[] args) {
        TreeNode test = new TreeNode(4);
        test.left = new TreeNode(2);
        test.right = new TreeNode(7);
        test.left.left = new TreeNode(1);
        test.left.right = new TreeNode(4);
        test.right.left = new TreeNode(6);
        test.right.right = new TreeNode(9);

        simple(test);
    }

    public static TreeNode simple(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode tmp = root.left;
        root.left = simple(root.right);
        root.right = simple(tmp);
        return root;
    }
}
