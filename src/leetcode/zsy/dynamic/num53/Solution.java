package leetcode.zsy.dynamic.num53;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-02 20:56
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        //int pre = 0, maxAns = nums[0];
        //for (int x : nums) {
        //    pre = Math.max(pre + x, x);
        //    maxAns = Math.max(maxAns, pre);
        //}
        //return maxAns;
        int max = nums[0];
        int[] f = new int[nums.length];
        f[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            f[i] = Math.max(nums[i],nums[i]+f[i-1]);
            max = Math.max(max,f[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }
}

