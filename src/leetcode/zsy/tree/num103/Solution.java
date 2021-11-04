package leetcode.zsy.tree.num103;

import basic.zsy.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-04 9:14
 */
public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
        linkedList.add(root);
        boolean isOrderLeft = true;
        while (!linkedList.isEmpty()){
            Deque<Integer> levelList = new LinkedList<Integer>();
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = linkedList.poll();
                if (isOrderLeft){
                    levelList.addLast(curNode.val);
                }else {
                    levelList.addFirst(curNode.val);
                }
                if (curNode.left!=null){
                    linkedList.add(curNode.left);
                }
                if (curNode.right!=null){
                    linkedList.add(curNode.right);
                }
            }
            res.add(new LinkedList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        return res;
    }
}
