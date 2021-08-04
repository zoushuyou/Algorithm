package leetcode.zsy.array.num189;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-04 17:08
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int tmp;
        for (int i = nums.length - k; i < nums.length; i++) {
            tmp = nums[nums.length-1];
            for (int j = nums.length-1; j >= 1; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tmp;
        }
/*        int n = nums.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }*/
    }

    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        solution.rotate(nums,3);
    }
}
