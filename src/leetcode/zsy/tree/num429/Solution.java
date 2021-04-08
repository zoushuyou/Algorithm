package leetcode.zsy.tree.num429;

import basic.zsy.tree.Node;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null){
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
           int size = queue.size();
           List<Integer> level = new LinkedList<>();
           for (int i = 0; i < size; i++){
               Node node = queue.poll();
               level.add(node.val);
               queue.addAll(node.children);
           }
           res.add(level);
        }
        return res;
    }
}
