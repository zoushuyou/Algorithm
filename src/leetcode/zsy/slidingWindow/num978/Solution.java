package leetcode.zsy.slidingWindow.num978;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-07-17 16:19
 */
public class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return len;
        }

        int left = 0;
        int right = 1;
        // 为 true 表示 arr[i - 1] < arr[i]
        boolean pre = false;
        int res = 1;
        while (right < len) {
            boolean current = arr[right - 1] < arr[right];
            if (current == pre) {
                left = right - 1;
            }
            if (arr[right - 1] == arr[right]) {
                left = right;
            }
            right++;
            res = Math.max(res, right - left);
            pre = current;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {9,4,2,10,7,8,8,1,9};
        solution.maxTurbulenceSize(nums);
    }
}
