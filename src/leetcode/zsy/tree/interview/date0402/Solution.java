package leetcode.zsy.tree.interview.date0402;

import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-24 20:01
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return method(nums,0,nums.length-1);
    }

    public TreeNode method(int[] nums, int l, int r) {
        if ( l > r ){
            return null;
        }
        int index = (l + r) / 2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = method(nums,l,index-1);
        root.right = method(nums,index+1,r);
        return root;
    }
}
