package leetcode.zsy.tree.num559;

import basic.zsy.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
//    public int maxDepth(Node root) {
//        if(root == null){
//            return 0;
//        }
//        int depth=0;
//        for (int i = 0; i < root.children.size(); i++) {
//            depth = Math.max(depth,maxDepth(root.children.get(i)));
//        }
//        return depth+1;
//    }


    public int maxDepth(Node root) {  //层序遍历解法
        if(root == null)
            return 0;
        if(root.children.size() == 0)
            return 1;
        int depth = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            depth++;
            while(count > 0){
                Node node = queue.poll();
                if(node.children.size() != 0)
                    queue.addAll(node.children);
                count--;
            }
        }
        return depth;
    }
}
