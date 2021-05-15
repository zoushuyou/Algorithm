package leetcode.zsy.tree.offer.num54;


import basic.zsy.tree.TreeNode;

import java.util.ArrayList;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-15 23:11
 */
public class Solution {

    ArrayList<Integer> list = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
        if (root == null){
            return 0;
        }

        recur(root,list);

        return list.get(list.size()-k);
    }

    private void recur(TreeNode root, ArrayList<Integer> list) {
        if (root == null){
            return;
        }
        recur(root.left,list);
        list.add(root.val);
        recur(root.right,list);
    }
}
