package leetcode.zsy.dynamic.num304;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-13 10:22
 */
public class NumMatrix {

    int[][] nums = null;

    public NumMatrix(int[][] matrix) {
        nums = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += nums[i][j];
            }
        }
        return sum;
    }
}
