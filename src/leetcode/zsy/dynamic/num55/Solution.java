package leetcode.zsy.dynamic.num55;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-28 9:31
 */
public class Solution {
    public boolean canJump(int[] nums){
        int n = nums.length;
        int rightMax = 0;
        for (int i = 0; i < n; i++) {
            if (i <= rightMax){
                rightMax = Math.max(rightMax,i+nums[i]);
                if (rightMax >= n-1){
                    return true;
                }
            }
        }
        return false;
    }
}
