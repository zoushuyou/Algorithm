package leetcode.zsy.string.num190;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-03 9:43
 */
public class Solution {
    public int reverseBits(int n) {
        int res = 0;
        int count = 0;
        while (count < 32) {
            res <<= 1;  //res 左移一位空出位置
            res |= (n & 1); //得到的最低位加过来
            n >>= 1;//原数字右移一位去掉已经处理过的最低位
            count++;
        }
        return res;
    }
}
