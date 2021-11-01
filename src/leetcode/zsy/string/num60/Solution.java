package leetcode.zsy.string.num60;

import java.util.Arrays;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-01 9:34
 */
public class Solution {

    public String getPermutation(int n,int k){
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i-1] * i;
        }
        --k;
        StringBuffer ans = new StringBuffer();
        int[] valid = new int[n+1];
        Arrays.fill(valid,1);
        for (int i = 1; i <= n; i++) {
            int order = k / factorial[n-i] + 1;
            for (int j = 1; j <= n ; j++) {
                order -= valid[j];
                if (order == 0){
                    ans.append(j);
                    valid[j] = 0;
                    break;
                }
            }
            k %= factorial[n-i];
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.getPermutation(4,9);
    }
}
