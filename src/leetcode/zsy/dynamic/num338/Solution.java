package leetcode.zsy.dynamic.num338;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-01 17:08
 */
public class Solution {
    public static int[] countBits(int n) {
        int[] bits = new int[n+1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i >> 1] + (i & 1);
        }
        return bits;
    }

    public static void main(String[] args) {
        countBits(5);
    }
}
