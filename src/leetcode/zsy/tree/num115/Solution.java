package leetcode.zsy.tree.num115;

import basic.zsy.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
//    List<Integer> list = new ArrayList<>();
//
//    public List<Integer> postorderTraversal(TreeNode root) {
//        if (root == null) {
//            return list;
//        }
//
//        postorderTraversal(root.left);
//        postorderTraversal(root.right);
//        list.add(root.val);
//        return list;
//    }


    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        while (!deque.isEmpty() || root != null){
            if (root != null){
                deque.push(root);
                list.add(0,root.val);
                root =root.right;
            }else {
                TreeNode tmp = deque.pop();
                root = tmp.left;
            }
        }
        return list;
    }
}
