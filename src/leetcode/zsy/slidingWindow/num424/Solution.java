package leetcode.zsy.slidingWindow.num424;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-28 21:43
 */
public class Solution {
    public int characterReplacement(String s, int k) {
        int[] num = new int[26];
        int maxn = 0, n = s.length();
        int left = 0, right = 0;
        while (right < n){
            num[s.charAt(right) - 'A']++;
            maxn = Math.max(maxn,num[s.charAt(right) - 'A']);
            if (right - left + 1 - maxn > k){
                num[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }

    public static void main(String[] args) {
        String s = "CCABACADAECCA";
        Solution solution = new Solution();
        System.out.println(solution.characterReplacement(s,2));
    }
}
