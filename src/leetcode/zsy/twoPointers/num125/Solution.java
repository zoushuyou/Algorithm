package leetcode.zsy.twoPointers.num125;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-10 13:53
 */
public class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }

    //public boolean isPalindrome(String s) {
    //    s = s.replaceAll("[^a-zA-Z0-9]*","").toLowerCase();
    //    int m=0,n=s.length()-1;
    //    for (int i = 0; i < s.length(); i++) {
    //        char one = s.charAt(m+i);
    //        char two = s.charAt(n-i);
    //        if (one != two){
    //            return false;
    //        }
    //        if (m>=n){
    //            break;
    //        }
    //    }
    //    return true;
    //}

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome("A man, a plan, a canal: Panama");
    }
}
