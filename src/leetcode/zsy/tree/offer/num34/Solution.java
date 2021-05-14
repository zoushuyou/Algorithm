package leetcode.zsy.tree.offer.num34;

import basic.zsy.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-14 9:42
 */
public class Solution {
/*    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        LinkedList<Integer> tmp = new LinkedList<>();
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            tmp.add(node.val);
            if (node.left != null){
                stack.push(node.left);
            }
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left == null && node.right == null){
                int sum = 0;
                for (Integer i : tmp) {
                    sum += i;
                }
                if (sum == target){
                    res.add(tmp);
                }
            }
        }
        return res;
    }*/

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return res;
        }
        recur(root, target);
        return res;
    }

    private void recur(TreeNode root, int target) {

        if (root==null){
            return;
        }
        target -= root.val;
        list.add(root.val);
        if (target == 0 && root.left == null && root.right == null){
            res.add(new LinkedList<>(list));
        }
        recur(root.left,target);
        recur(root.right,target);
        list.removeLast();
    }
}