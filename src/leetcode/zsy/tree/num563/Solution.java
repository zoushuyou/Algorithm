package leetcode.zsy.tree.num563;

import basic.zsy.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    //错误  不符合题目意思
/*
    public int findTilt(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left!=null && node.right!=null){
                int val = Math.abs(node.left.val - node.right.val);
                list.add(val);
                queue.add(node.left);
                queue.add(node.right);
            }else if (node.left != null){
                int val = Math.abs(node.left.val);
                list.add(val);
                queue.add(node.left);
            }else if (node.right != null){
                int val = Math.abs(node.right.val);
                list.add(val);
                queue.add(node.right);
            }
        }
        int res =0;
        for (int i = 0; i < list.size(); i++) {
            res+=list.get(i);
        }
        return res;
    }*/

    int res = 0;

    public int findTilt(TreeNode root) {

        transfer(root);
        return res;
    }

    private int transfer(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = transfer(root.left);
        int right = transfer(root.right);
        res+=Math.abs(left-right);
        return left+right+root.val;
    }

}
