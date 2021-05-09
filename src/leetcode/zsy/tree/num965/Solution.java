package leetcode.zsy.tree.num965;

import basic.zsy.tree.TreeNode;

public class Solution {

    static boolean f=true;
    public static boolean isUnivalTree(TreeNode root) {
        if (root == null){
            return false;
        }
        int num = root.val;
        dfs(root,num);
        return f;

    }

    private static void dfs(TreeNode root, int num) {
        if(root !=null){
            if(root.val != num){
                f=false;
                return;
            }
            dfs(root.left,num);
            dfs(root.right,num);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(2);

        System.out.println(isUnivalTree(root));
    }

}
