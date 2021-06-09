package leetcode.zsy.dynamic.num746;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-09 16:08
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0){
            return 0;
        }
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = Math.min(cost[1],cost[1]+cost[0]);
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-2],dp[i-1]) + cost[i];
        }
        return Math.min(dp[cost.length-2],dp[cost.length-1]);
    }
}
