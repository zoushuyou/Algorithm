package leetcode.zsy.string.num8;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-24 13:22
 */
public class Solution {
    public int myAtoi(String s) {
        Pattern p = Pattern.compile("^\\s*([+-]?\\d+)");
        Matcher m = p.matcher(s);
        if (!m.find()){
            return 0;
        }
        BigDecimal r = new BigDecimal(m.group(1));
        if (r.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0){
            return Integer.MAX_VALUE;
        }else if (r.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0){
            return Integer.MIN_VALUE;
        }else {
            return r.intValue();
        }
    }

    public int myAtoi2(String str) {
        int sign = 1;
        int ans = 0, pop = 0;
        boolean hasSign = false; //代表是否开始转换数字
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-' && !hasSign) {
                sign = -1;
                hasSign = true;
                continue;
            }
            if (str.charAt(i) == '+' && !hasSign) {
                sign = 1;
                hasSign = true;
                continue;
            }
            if (str.charAt(i) == ' ' && !hasSign) {
                continue;
            }

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                hasSign = true;
                pop = str.charAt(i) - '0';
                //和上道题判断出界一个意思只不过记得乘上 sign 。
                if (ans * sign > Integer.MAX_VALUE / 10 || (ans * sign == Integer.MAX_VALUE / 10 && pop * sign > 7))
                    return 2147483647;
                if (ans * sign < Integer.MIN_VALUE / 10 || (ans * sign == Integer.MIN_VALUE / 10 && pop * sign < -8))
                    return -2147483648;
                ans = ans * 10 + pop;
            } else {
                return ans * sign;
            }
        }
        return ans * sign;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("123"));
    }
}
