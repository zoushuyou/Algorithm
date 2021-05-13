package leetcode.zsy.dynamic.num120;

import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-13 10:32
 */
public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0){
                    dp[i][j] = dp[i-1][j] + triangle.get(i).get(j);
                }else if (j == triangle.get(i).size() -1){
                    dp[i][j] = dp[i-1][j-1] + triangle.get(i).get(j);
                }else {
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]) + triangle.get(i).get(j);
                }
            }
        }
        int min = dp[n-1][0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min,dp[n-1][i]);
        }
        return min;
    }

}
