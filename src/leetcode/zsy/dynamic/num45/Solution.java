package leetcode.zsy.dynamic.num45;

/**
 * @author zousy
 * @version v1.0
 * @Description
 */
public class Solution {
    public int jump(int[] nums){
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            maxPosition = Math.max(maxPosition,nums[i]+i);
            if (i == end){
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
