package leetcode.zsy.string.num179;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-05 13:22
 */
public class Solution {
    public String largestNumber(int[] nums) {Integer[] n = new Integer[nums.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = nums[i];
        }
        Arrays.sort(n, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int len1 = (o1 + "").length();
                int len2 = (o2 + "").length();

                if (len1 == len2){
                    if (o1 > o2){
                        return -1;
                    }else if (o1 < o2){
                        return 1;
                    }else {
                        return 0;
                    }
                }

                int combination1 =(int) (o1 * Math.pow(10,len2)) + o2;
                int combination2 =(int) (o2 * Math.pow(10,len1)) + o1;

                if (combination1 > combination2){
                    return -1;
                }else if (combination1 < combination2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            stringBuilder.append(n[i]);
        }
        String res = stringBuilder.toString();
        return res.charAt(0) == '0' ? "0" : res;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {12,1441,123,9123,91};
        solution.largestNumber(nums);
    }
}
