package leetcode.zsy.dynamic.num139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-17 9:17
 */
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict){
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
