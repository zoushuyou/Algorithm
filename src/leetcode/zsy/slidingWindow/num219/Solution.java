package leetcode.zsy.slidingWindow.num219;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-26 22:12
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            while (j<i+k+1 && j<nums.length ){
                if (nums[i] == nums [j]){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}
