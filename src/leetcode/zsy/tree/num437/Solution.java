package leetcode.zsy.tree.num437;

import basic.zsy.tree.TreeNode;

public class Solution {

    int res = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }
        int add = 0;
        dfs(root,sum,add);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return res;
    }


    private void dfs(TreeNode root, int sum, int add) {
        if (root == null){
            return;
        }
        add += root.val;
        if (add == sum){
            res++;
        }
        dfs(root.left,sum,add);
        dfs(root.right,sum,add);
    }

}
