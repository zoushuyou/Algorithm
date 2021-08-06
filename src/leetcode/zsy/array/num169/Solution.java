package leetcode.zsy.array.num169;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-06 9:29
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = map.getOrDefault( nums[i],0);
            if (res == nums.length / 2 ){
                return nums[i];
            }
            map.put(nums[i],res+1);
        }
        return -1;
    }
}
