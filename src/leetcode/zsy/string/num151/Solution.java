package leetcode.zsy.string.num151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-19 13:48
 */
public class Solution {
    public String reverseWords(String s){
/*        String[] s1 = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = s1.length -1; i>=0; i--){
            res =res.append(" ").append( s1[i]);
        }
        return res.toString().trim();*/
        s = s.trim();
        List<String> list = Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ",list);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseWords("  hello world  ");
    }
}
