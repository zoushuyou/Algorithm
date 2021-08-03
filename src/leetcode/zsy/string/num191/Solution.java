package leetcode.zsy.string.num191;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-03 9:29
 */
public class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                res++;
            }
        }
        return res;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        while (n!=0){
            count += n & 1;
            n >>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(0b00000000000000000000000000001011));
    }

}
