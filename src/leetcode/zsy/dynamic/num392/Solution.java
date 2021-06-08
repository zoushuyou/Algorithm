package leetcode.zsy.dynamic.num392;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-08 11:03
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {

        int n = s.length();
        int m = t.length();
        if (n == 0){
            return true;
        }
        if (m == 0){
            return false;
        }
        boolean[] dp = new boolean[n];
        int start = -1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int index = t.substring(start+1,m).indexOf(c);
            if (index == -1){
                dp[i] =false;
                break;
            }
            if (start >= 0){
                index += start+1;
            }
            if (index > m){
                dp[i] =false;
                break;
            }
            if (index != -1 && index >= start ){
                start = index;
                dp[i] = true;
            }
        }
        return dp[n-1];
    }

    //双指针法
    //public boolean isSubsequence(String s, String t) {
    //    int n = s.length(), m = t.length();
    //    int i = 0, j = 0;
    //    while (i < n && j < m) {
    //        if (s.charAt(i) == t.charAt(j)) {
    //            i++;
    //        }
    //        j++;
    //    }
    //    return i == n;
    //}
    //
    //作者：LeetCode-Solution
    //链接：https://leetcode-cn.com/problems/is-subsequence/solution/pan-duan-zi-xu-lie-by-leetcode-solution/
    //来源：力扣（LeetCode）
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "acb";
        String t = "ahbgdc";
        System.out.println(solution.isSubsequence(s,t));
    }
}
