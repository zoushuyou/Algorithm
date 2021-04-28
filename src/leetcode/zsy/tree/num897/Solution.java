package leetcode.zsy.tree.num897;

import basic.zsy.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-28 9:50
 */
public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null){
            return root;
        }
        List<Integer> res = new LinkedList<>();
        transfer(root,res);
        TreeNode tree = new TreeNode(res.get(0));
        res.remove(0);
        TreeNode tmp = tree;
        for (int i = 0; i < res.size(); i++) {
            tmp.right = new TreeNode(res.get(i));
            tmp = tmp.right;
        }
        return tree;
    }

    private void transfer(TreeNode root, List<Integer> res) {
        if (root == null){
            return;
        }
        transfer(root.left,res);
        res.add(root.val);
        transfer(root.right,res);
    }
}
