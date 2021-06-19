package leetcode.zsy.twoPointers.num349;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-19 11:02
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0, j =0;
        Map<Integer, Integer> map = new HashMap<>();
        while (i<nums1.length){
            map.put(nums1[i],nums1[i]);
            i++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (j<nums2.length){
            if (map.containsKey(nums2[j])){
                map.remove(nums2[j]);
                list.add(nums2[j]);
            }
            j++;
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < res.length; k++) {
            res[k] = list.get(k);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(solution.intersection(nums1,nums2).toString());
    }
}
