package leetcode.zsy.tree.offer.num55;

import basic.zsy.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-15 23:25
 */

public class Solution {

    public int maxDepth(TreeNode root) {
        int res = 0;
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            res++;
        }
        return res;
    }


    public int maxDepth2(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth2(root.left)+1,maxDepth2(root.right)+1);
    }
}
