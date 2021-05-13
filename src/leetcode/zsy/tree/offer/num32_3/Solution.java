package leetcode.zsy.tree.offer.num32_3;

import basic.zsy.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-13 9:26
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            LinkedList<Integer> tmp = new LinkedList<>();
            int len = deque.size();
            for (int i = 0; i < len; i++) {
                TreeNode treeNode = deque.poll();
                if (res.size() % 2 == 0){
                    tmp.addLast(treeNode.val);
                }else {
                    tmp.addFirst(treeNode.val);
                }
                if (treeNode.left != null){
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null){
                    deque.addLast(treeNode.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
