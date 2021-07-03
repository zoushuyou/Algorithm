package leetcode.zsy.slidingWindow.num567;

import java.util.Arrays;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-07-03 19:20
 */
public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] num1 = new int[26] , num2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            num1[s1.charAt(i) - 'a']++;
        }
        int left = 0, right = 0;
        while (right < s2.length()){
            num2[s2.charAt(right) - 'a']++;
            if (right - left +1 == s1.length()){
                if (Arrays.equals(num1,num2)){
                    return true;
                }
                num2[s2.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return false;
    }
}
