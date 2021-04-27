package leetcode.zsy.tree.num701;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-27 18:10
 */
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null){
            root = new TreeNode(val);
            return root;
        }
        insertBST(root,val);
        return root;
    }

    private void insertBST(TreeNode root, int val) {
        if (root.val > val){
            if (root.left !=null){
                insertBST(root.left,val);
            }else {
                root.left = new TreeNode(val);
            }
        }
        if (root.val < val) {
            if (root.right != null) {
                insertBST(root.right, val);
            }else {
                root.right = new TreeNode(val);
            }
        }
    }
}
