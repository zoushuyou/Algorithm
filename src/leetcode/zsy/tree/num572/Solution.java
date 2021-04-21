package leetcode.zsy.tree.num572;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-21 10:51
 *
 * 示例 1:
 * 给定的树 s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 t：
 *
 *    4
 *   / \
 *  1   2
 * 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
 *
 */
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return transfer(s,t);
    }

    private boolean transfer(TreeNode s, TreeNode t) {
        if (s == null ){
            return false;
        }
        return check(s,t) || transfer(s.left,t) ||transfer(s.right,t);
    }

    private boolean check(TreeNode s, TreeNode t) {
        if (s == null && t == null){
            return true;
        }
        if (s == null || t == null || s.val!=t.val){
            return false;
        }
        return check(s.left, t.left) && check(s.right, t.right);
    }
}
