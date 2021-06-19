package leetcode.zsy.twoPointers.num344;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-19 10:50
 */
public class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        while (i < j){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }
}
