package leetcode.zsy.tree.num590;

import basic.zsy.tree.Node;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-26 9:17
 */
public class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null){
            return res;
        }
        Deque<Node> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()){
            Node tmp = deque.pollLast();
            res.addFirst(tmp.val);
            for (Node node : tmp.children){
                if (node != null){
                    deque.add(node);
                }
            }
        }
        return res;
    }
}
