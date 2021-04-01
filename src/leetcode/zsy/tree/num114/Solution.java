package leetcode.zsy.tree.num114;

import basic.zsy.tree.TreeNode;

import java.util.*;

public class Solution {

//    List<Integer> list = new ArrayList<>();

//    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root == null) {
//            return list;
//        }
//
//        list.add(root.val);
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
//        return list;
//    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode tmp = root;
        while (!deque.isEmpty() || tmp != null){
            while (tmp != null){
                list.add(tmp.val);
                deque.push(tmp);
                tmp = tmp.left;
            }
            tmp = deque.pop();
            tmp = tmp.right;
        }
        return list;
    }
}
