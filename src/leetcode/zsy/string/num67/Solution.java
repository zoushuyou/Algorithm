package leetcode.zsy.string.num67;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-02 9:16
 */
public class Solution {

    public String addBinary(String a,String b){
        StringBuilder ans = new StringBuilder();
        int m = a.length()-1 , n = b.length() -1;
        int carry = 0;
        while (m >= 0 || n >= 0){
            int i = m >= 0 ? a.charAt(m) - 48 : 0;
            int j = n >= 0 ? b.charAt(n) - 48 : 0;
            int sum = i + j + carry;
            carry = 0;
            if (sum >= 2){
                sum = sum % 2;
                carry = 1;
            }
            ans.insert(0,sum);
            m--;
            n--;
        }
        if (carry == 1){
            ans.insert(0,carry);
        }
        return ans.toString();
    }
}
