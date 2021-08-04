package leetcode.zsy.string.num172;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-04 17:50
 */
public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0){
            System.out.println(n);
            count += n/5;
            n = n/5;
            System.out.println(n);
        }
        System.out.println("count:  "+count);
        return count;
    }

    public int trailingZeroes2(int n) {
        System.out.println(Integer.MAX_VALUE);
        int res = dfs(n),tmp = 0;
        String s = String.valueOf(res);
        int len = s.length();
        for (int i = len-1; i >0 ; i--) {
            if (s.charAt(i) == '0'){
                tmp++;
                continue;
            }else {
                break;
            }
        }
        System.out.println(res);
        return tmp;
    }

    private int dfs(int n) {
        if (n > 1){
            return dfs(n-1) * n;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.trailingZeroes(12);
    }
}
