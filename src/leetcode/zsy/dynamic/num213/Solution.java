package leetcode.zsy.dynamic.num213;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-07 16:19
 */
public class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
    }

    public int robRange(int[] nums, int start, int end) {
        int first = nums[start];
        int second = Math.max(first,nums[start+1]);
        for (int i = start + 2; i <= end; i++) {
            int tmp = second;
            second = Math.max(nums[i]+first,second);
            first = tmp;
        }
        return second;
    }


}
