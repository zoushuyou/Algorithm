package leetcode.zsy.tree.num958;

import basic.zsy.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-30 15:08
 */
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean reachedEnd = false;
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(reachedEnd && cur != null){
                return false;
            }
            if(cur == null){
                reachedEnd = true;
                continue;
            }
            q.offer(cur.left);
            q.offer(cur.right);
        }
        return true;
    }

/*    public boolean isCompleteTree(TreeNode root) {
        if (root == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<TreeNode> list = new ArrayList<>();
        int num = 0;
        while (!queue.isEmpty()){
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                list.add(node);
                if (node != null){
                    queue.add(node.left);
                    queue.add(node.right);
                    num++;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            if (list.get(i) == null){
                return false;
            }
        }

        return true;
    }*/
}
