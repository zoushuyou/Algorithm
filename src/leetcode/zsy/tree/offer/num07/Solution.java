package leetcode.zsy.tree.offer.num07;

import basic.zsy.tree.TreeNode;

import java.util.HashMap;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-10 10:56
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *  
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *  
 *
 * 限制：
 *
 * 0 <= 节点个数 <= 5000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }

    public TreeNode recur(int i, int l, int r) {
        if (l > r){
            return null;
        }
        TreeNode root = new TreeNode(preorder[i]);
        int index = map.get(preorder[i]);

        root.left = recur(i+1,l,index-1);
        root.right = recur(i+(index - l + 1),index + 1, r);
        return root;
    }
}
