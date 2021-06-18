package leetcode.zsy.twoPointers.num287;

import java.util.HashMap;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-18 17:46
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],nums[i]);
            }else {
                res = nums[i];
            }
        }
        return res;
    }

    //快慢指针  如果存在重复的数字 那么可以看作类似链表且链表中有环
    //slow 移 1 步  fast 移 2 步 相遇后
    //slow至0 从头开始移动  fast和slow再移动相等的长度就是环的入口
    public int findDuplicate2(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
