package leetcode.zsy.stack.num496;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-08 15:34
 */
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums2 == null || nums1 == null){
            return null;
        }
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int index = findIndex(nums2,nums1[i]);
            int tmp = -1;
            for (int j = index+1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]){
                    tmp = nums2[j];
                    break;
                }
            }
            res[i] = tmp;
        }
        return res;
    }

    public int findIndex(int[] nums2, int n){
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == n){
                return i;
            }
        }
        return -1;
    }
}
