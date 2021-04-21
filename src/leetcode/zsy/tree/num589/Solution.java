package leetcode.zsy.tree.num589;

import basic.zsy.tree.Node;

import java.util.*;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-21 13:09
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Deque<Node> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()){
            Node node = deque.poll();
            List<Node> list = new LinkedList<>();
            if (node!=null){
                res.add(node.val);
                list= node.children;
            }
            for (int i = list.size()-1; i >= 0; i--) {
                deque.addFirst(list.get(i));
            }
        }
        return res;
    }

    public List<Integer> dfs(Node root){
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    private void helper(Node root, List<Integer> res) {
        if (root == null){
            return;
        }
        res.add(root.val);
        List<Node> list = root.children;
        for (Node node: list){
            helper(node,res);
        }
    }
}
