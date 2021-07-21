package leetcode.zsy.string.num214;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-07-21 10:14
 */
public class Solution {
    public String shortestPalindrome2(String s) {
        int end = s.length() - 1;
        while (end > 0){
            if (isPalindromic(s,0,end)){
                break;
            }
            end--;
        }
        return new StringBuilder(s.substring(end + 1)).reverse() + s;
    }

    public boolean isPalindromic(String s, int start, int end) {
        char[] c = s.toCharArray();
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public String shortestPalindrome3(String s) {
        int i = 0 , j = s.length() -1;
        while (j >= 0){
            if(s.charAt(i) == s.charAt(j)){
                i++;
            }
            j--;
        }

        String suffix = s.substring(i);

        String reverse = new StringBuilder(suffix).reverse().toString();

        return reverse + shortestPalindrome3(s.substring(0,i)) + suffix;
    }
}
