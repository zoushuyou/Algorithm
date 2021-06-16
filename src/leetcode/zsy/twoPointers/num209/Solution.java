package leetcode.zsy.twoPointers.num209;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-16 13:54
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0 , sum = 0 , res = Integer.MAX_VALUE;
        if (nums == null){
            return j;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < target) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            j = 0;
            sum = 0;
            while (sum < target && i+j < nums.length){
                sum += nums[i+j];
                j++;
            }
            if (sum >= target){
                res = Math.min(res,j);
            }

        }
        return res;
    }

    //滑动窗口
    public int minSubArrayLen2(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

}
