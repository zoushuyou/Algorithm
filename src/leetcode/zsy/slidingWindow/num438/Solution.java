package leetcode.zsy.slidingWindow.num438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-07-02 11:14
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()){
            return list;
        }
        int n = p.length(), m = s.length();
        int[] nums = new int[26];
        int[] window = new int[26];
        for (int i = 0; i < n; i++) {
            nums[p.charAt(i) - 'a']++;
        }
        int left = 0, right = 0;
        while (right < m){
            window[s.charAt(right) - 'a']++;
            while (right - left +1 == p.length()){
                if (Arrays.equals(window,nums)){
                    list.add(left);
                }
                window[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return list;
    }
}
