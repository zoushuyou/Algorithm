package leetcode.zsy.string.num50;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-25 9:19
 */
public class Solution {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

}
