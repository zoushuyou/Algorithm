package leetcode.zsy.tree.num129;

import basic.zsy.tree.TreeNode;

import java.util.ArrayList;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-11 9:18
 */
public class Solution {

    public int sumNumbers(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list,0);
        int res = 0;
        for(Integer i : list){
            res +=i;
        }
        return res;
    }

    private void dfs(TreeNode root, ArrayList<Integer> list,int tmp) {
        if (root == null){
            return;
        }
        tmp = tmp * 10 +root.val;
        if (root.left != null){
            dfs(root.left,list,tmp);
        }
        if (root.right !=null){
            dfs(root.right,list,tmp);
        }
        if (root.left == null && root.right == null){
            list.add(tmp);
        }
    }

    public int sum(TreeNode root){
        return df(root,0);
    }

    private int df(TreeNode root, int i) {
        if (root == null){
            return 0;
        }
        int sum = i * 10 + root.val;
        if (root.left == null && root.right == null){
            return sum;
        }else {
            return df(root.left,sum) + df(root.right,sum);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        treeNode.left = new TreeNode(2);
        treeNode.right= new TreeNode(3);
        solution.sumNumbers(treeNode);
    }
}
