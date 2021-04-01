package leetcode.zsy.tree.num538;

import basic.zsy.tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public TreeNode convertBST(TreeNode root) {

        Deque<TreeNode> deque = new LinkedList<>();
        int sum = 0;
        TreeNode rtmp = root;
        while (!deque.isEmpty() || rtmp != null){
            if (rtmp != null){
                deque.push(rtmp);
                rtmp =rtmp.right;
            }else {
                TreeNode tmp = deque.pop();
                tmp.val += sum;
                sum = tmp.val;
                rtmp = tmp.left;
            }

        }
        return root;
    }
}
