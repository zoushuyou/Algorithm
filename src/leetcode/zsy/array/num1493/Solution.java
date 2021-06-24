package leetcode.zsy.array.num1493;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-24 15:32
 */
public class Solution {
    public int longestSubarray(int[] nums) {
        if (nums == null){
            return 0;
        }
        int res = 0 , i =0;
        while (i < nums.length){
            int len = 0;
            boolean flag = true;
            if (nums[i] == 1){
                len++;
                int j = i + 1;
                while ( j < nums.length){
                    if (nums[j] != 1 && !flag){
                        break;
                    }
                    if (nums[j] == 1){
                        len++;
                    }
                    if (nums[j] != 1 && flag){
                        flag = false;
                    }
                    j++;
                }
            }
            res = Math.max(res,len);
            i++;
        }
        if (res == nums.length){
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,1,0,0,1,1,1,0,1};
        Solution solution = new Solution();
        System.out.println(solution.longestSubarray(a));
    }
}
