package leetcode.zsy.slidingWindow.num930;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-07-16 10:50
 */
public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int k = 0, sum = 0;
            while (i+k < nums.length){
                sum += nums[i+k];
                if (sum == goal){
                    res++;
                }
                k++;
            }
        }
        return res;
    }

    public int numSubarraysWithSumLeetcode(int[] nums, int goal){
        int sum = 0,res=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(sum,map.getOrDefault(sum,0) + 1);
            sum += num;
            res += map.getOrDefault(sum-goal,0);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,0,1,0,1,1,1,1};
        System.out.println(solution.numSubarraysWithSumLeetcode(nums,8));
    }
}
