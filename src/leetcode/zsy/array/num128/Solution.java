package leetcode.zsy.array.num128;

import java.util.Arrays;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-10 9:38
 */
public class Solution {

    public int longestConsecutive(int[] nums){
        Arrays.sort(nums);
        int[] df = new int[nums.length];
        if (nums.length == 0){
            return 0;
        }else {
            df[0] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] + 1 == nums[i]){
                df[i] = df[i-1] + 1;
            }else if (nums[i-1] == nums[i]){
                df[i] = df[i-1];
            }else {
                df[i] = 1;
            }
        }
        int res = 1;
        for (int i : df) {
            res = Math.max(res, i);
        }
        return res;
    }
}
