package leetcode.zsy.twoPointers.num283;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-18 13:32
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == 0){
                    continue;
                }
                if (nums[i] == 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }else {
                    break;
                }
            }
        }
    }


    public void moveZeroe2(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
