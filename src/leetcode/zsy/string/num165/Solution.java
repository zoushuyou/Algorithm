package leetcode.zsy.string.num165;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-09 9:55
 */
public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int i = 0, j = 0;
        while (i < nums1.length || j < nums2.length) {
            //这个技巧经常用到，当一个已经遍历结束的话，我们将其赋值为 0
            String num1 = i < nums1.length ? nums1[i] : "0";
            String num2 = j < nums2.length ? nums2[j] : "0";
            int res = compare(num1, num2);
            if (res == 0) {
                i++;
                j++;
            } else {
                return res;
            }
        }
        return 0;
    }

    private int compare(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        if (n1 > n2) {
            return 1;
        } else if (n1 < n2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.compareVersion("1.0.1","1");
    }
}
