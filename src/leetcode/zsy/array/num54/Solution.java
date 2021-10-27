package leetcode.zsy.array.num54;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-27 9:26
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int l = 0;
        while (list.size() < m * n){
            for (int i = l; i <= n - l-1; i++) {
                list.add(matrix[l][i]);
            }
            if (list.size() == m *n){
                break;
            }
            for (int i = l+1; i <= m - l-1; i++) {
                list.add(matrix[i][n-1-l]);
            }
            if (list.size() == m *n){
                break;
            }
            for (int i = n-2-l; i >= l; i--) {
                list.add(matrix[m-1-l][i]);
            }
            if (list.size() == m *n){
                break;
            }
            for (int i = m-2-l; i > l; i--) {
                list.add(matrix[i][l]);
            }
            if (list.size() == m *n){
                break;
            }
            l++;
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        solution.spiralOrder(nums);
    }
}
