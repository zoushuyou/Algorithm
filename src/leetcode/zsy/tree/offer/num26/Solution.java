package leetcode.zsy.tree.offer.num26;

import basic.zsy.tree.TreeNode;

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null){
            return false;
        }
        Boolean res = false;
        if(A.val == B.val){
            res = dfs(A.left,B.left) && dfs(A.right,B.right);
        }
        return res || isSubStructure(A.left,B) || isSubStructure(A.right,B);

    }

    public boolean dfs(TreeNode A, TreeNode B) {
       if (A != null && B != null && A.val == B.val){
           return dfs(A.left,B.left) && dfs(A.right,B.right);
       }
       if (B == null){
           return true;
       }
       return false;
    }

    /**
     *    public boolean isSubStructure(TreeNode A, TreeNode B) {
     *         return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
     *     }
     *     boolean recur(TreeNode A, TreeNode B) {
     *         if(B == null) return true;
     *         if(A == null || A.val != B.val) return false;
     *         return recur(A.left, B.left) && recur(A.right, B.right);
     *     }
     *
     */

}
