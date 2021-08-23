package leetcode.zsy.array.num4;

import java.util.Arrays;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-23 19:08
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,num,0,nums1.length);
        System.arraycopy(nums2,0,num,nums1.length,nums2.length);
        Arrays.sort(num);
        int l = num.length;
        if (l%2 == 0){
            return (double) (num[l/2 - 1] + num[l/2]) / 2;
        }else {
            return num[l/2];
        }
    }
}
