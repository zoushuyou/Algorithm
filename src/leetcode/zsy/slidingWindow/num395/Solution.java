package leetcode.zsy.slidingWindow.num395;

import java.util.HashMap;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-28 14:46
 */
public class Solution {
/*  无法实现
    public int longestSubstring(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = map.get(s.charAt(i));
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (m[i] < k){
                continue;
            }
            int j = i+1;
            while (j < n){
                if (m[j] < k){
                    break;
                }
                j++;
            }
            res = Math.max(res,j-i);
        }
        return res;
    }*/

    public int longestSubstring(String s, int k) {
        if(s.length() < k){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        // aaabcccdeeefgggddd
        for (char c : map.keySet()){
            if (map.get(c) < k){
                int res = 0;
                for (String str : s.split(String.valueOf(c))){
                    res = Math.max(res,longestSubstring(str,k));
                }
                return res;
            }
        }
        return s.length();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s =  "aaabcccdeeefgggddd";
        solution.longestSubstring(s,3);
    }
}
