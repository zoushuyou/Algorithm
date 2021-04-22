package leetcode.zsy.tree.num617;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-22 10:07
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root2 == null){
            return root1;
        }
        if (root1 == null){
            return root2;
        }
        TreeNode res = new TreeNode(root1.val + root2.val);
        res.left = mergeTrees(root1.left,root2.left);
        res.right = mergeTrees(root1.right,root2.right);
        return res;
    }


/*
    private void transfer(TreeNode root1, TreeNode root2, TreeNode treeNode) {
        if (root1 == null && root2 == null){
            treeNode = null;
            return;
        }
        if (root1 != null && root2 != null){
            treeNode.val = root1.val + root2.val;
        }
        if (root1 == null){
            treeNode.val = root2.val;
            return;
        }
        if (root2 == null){
            treeNode.val = root1.val;
            return;
        }
        treeNode.left = new TreeNode();
        transfer(root1.left,root2.left,treeNode.left);
        treeNode.right = new TreeNode();
        transfer(root1.right,root2.right,treeNode.right);
    }*/
}
