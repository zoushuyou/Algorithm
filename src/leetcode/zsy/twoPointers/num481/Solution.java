package leetcode.zsy.twoPointers.num481;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-25 15:21
 */
public class Solution {
    public int magicalString(int n) {
        /*
        “1221121221221121122 ......”
         */
        StringBuffer stringBuffer = new StringBuffer("122");
        int end = 2;
        for (int i = stringBuffer.length()-1; i<n ;i++){
            int num = stringBuffer.charAt(i) - '0';
            if (end == 1){
                for (int j = 0; j < num; j++) {
                    stringBuffer.append("2");
                }
                end = 2;
            }else {
                for (int j = 0; j < num; j++) {
                    stringBuffer.append("1");
                }
                end = 1;
            }
        }
        int res = 0;
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == '1'){
                res++;
            }
        }
        return res;
    }
}
