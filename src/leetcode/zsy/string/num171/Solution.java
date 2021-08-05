package leetcode.zsy.string.num171;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-05 17:01
 */
public class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
            char c = columnTitle.charAt(i);
            res += (c - 'A' + 1) * Math.pow(26,len-i-1);
        }
        return res;
    }
}
