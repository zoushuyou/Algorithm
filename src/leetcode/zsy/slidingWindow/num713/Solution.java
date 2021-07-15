package leetcode.zsy.slidingWindow.num713;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-07-15 16:27
 */
public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k){
                continue;
            }else {
                res++;
            }
            int sum = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                sum = sum * nums[j];
                if (sum < k){
                    res++;
                }else {
                    break;
                }
            }
        }
        return res;
    }
}
