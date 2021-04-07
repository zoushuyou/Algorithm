package leetcode.zsy.tree.num257;

import basic.zsy.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<String> list = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root){
        if (root == null){
            return list;
        }
        outTree(root, "");
        return list;
    }

    private void outTree(TreeNode root, String s) {
        if (root != null){
            if (root.left == null && root.right == null){
                s = s +root.val;
                list.add(s);
                return;
            }else {
                s = s + root.val+"->";
                outTree(root.left,s);
                outTree(root.right,s);
            }
        }

    }
}
