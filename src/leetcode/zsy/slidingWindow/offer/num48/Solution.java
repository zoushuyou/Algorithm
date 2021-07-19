package leetcode.zsy.slidingWindow.offer.num48;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-07-19 14:43
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <=1){
            return n;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int j = i+1;
            while (j < n){
                String s1 = String.valueOf(s.charAt(j));
                if (!s.substring(i,j).contains(s1)){
                    j++;
                }else {
                    break;
                }
            }
            res = Math.max(res, j-i);
        }
        return res;
    }

    public int lengthOfLongestSubstringLeetCode(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }
}
