package leetcode.zsy.string.num38;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-09-24 14:08
 */
public class Solution {

    Map<Integer, String> map = new HashMap<>();

    public String countAndSay(int n) {
        count(n);
        return map.get(n);
    }

    public void count(int n){
        map.put(1,"1");
        for (int i = 2; i <= n; i++) {
            String s = map.get(i-1);
            int num = 0;
            StringBuilder m = new StringBuilder();
            for (int j = 0; j < s.length(); ) {
                int k = j;
                while (k<s.length()){
                    if (s.charAt(j) == s.charAt(k)){
                        k++;
                        continue;
                    }else {
                        break;
                    }
                }
                num = k-j;
                m.append(String.valueOf(num)+String.valueOf(s.charAt(j)));
                j=k;
            }
            map.put(i,m.toString());
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countAndSay(4);
    }



    public String countAndSay2(int n) {
        //第一行就直接输出
        if (n == 1) {
            return "1";
        }
        //得到上一行的字符串
        String last = countAndSay2(n - 1);
        //输出当前行的字符串
        return getNextString(last);

    }

    private String getNextString(String last) {
        //长度为 0 就返回空字符串
        if (last.length() == 0) {
            return "";
        }
        //得到第 1 个字符重复的次数
        int num = getRepeatNum(last);
        // 次数 + 当前字符 + 其余的字符串的情况
        return num + "" + last.charAt(0) + getNextString(last.substring(num));
    }

    //得到字符 string[0] 的重复个数，例如 "111221" 返回 3
    private int getRepeatNum(String string) {
        int count = 1;
        char same = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (same == string.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}
