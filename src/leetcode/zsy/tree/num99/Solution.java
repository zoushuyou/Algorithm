package leetcode.zsy.tree.num99;

import basic.zsy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-30 17:32
 */
public class Solution {

    public void recoverTree(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        inOrder(nums,root);
        int[] swapped  = checkNums(nums);
        recover(root, 2, swapped[0], swapped[1]);
    }

    public void recover(TreeNode root, int count, int x, int y) {
        if (root != null) {
            if (root.val == x || root.val == y) {
                root.val = root.val == x ? y : x;
                if (--count == 0) {
                    return;
                }
            }
            recover(root.right, count, x, y);
            recover(root.left, count, x, y);
        }
    }

    private int[] checkNums(List<Integer> nums) {
        int n = nums.size();
        int index1 = -1, index2 = -1;
        for (int i = 0; i < n - 1; ++i) {
            if (nums.get(i + 1) < nums.get(i)) {
                index2 = i + 1;
                if (index1 == -1) {
                    index1 = i;
                } else {
                    break;
                }
            }
        }
        int x = nums.get(index1), y = nums.get(index2);
        return new int[]{x, y};
    }

    private void inOrder(List<Integer> nums, TreeNode root) {
        if (root == null){
            return;
        }
        if (root.left != null){
            inOrder(nums,root.left);
        }
        nums.add(root.val);
        if (root.right!=null){
            inOrder(nums,root.right);
        }
    }
}
