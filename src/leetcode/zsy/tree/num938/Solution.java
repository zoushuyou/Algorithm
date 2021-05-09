package leetcode.zsy.tree.num938;

import basic.zsy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-30 15:02
 */
public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        int res = 0;
        for (Integer n : list){
            if (n >= low && n <= high ){
                res += n;
            }
        }
        return res;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null){
            return;
        }
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}
