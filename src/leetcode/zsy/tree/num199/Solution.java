package leetcode.zsy.tree.num199;

import basic.zsy.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-02 10:19
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue =new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        if (root == null){
            return list;
        }
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++) {
                TreeNode node = queue.poll();
                if (i == levelNum -1){
                    list.add(node.val);
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return list;
    }
}
