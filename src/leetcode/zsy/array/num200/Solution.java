package leetcode.zsy.array.num200;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-02 11:02
 */
public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        if (rows == 0){
            return count;
        }
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1'){
                    count++;
                    marked(i,j,rows,cols,grid);
                }
            }
        }
        return count;
    }

    private void marked(int r, int c, int rows, int cols, char[][] grid){
        if (r == -1 || c == -1 || r == rows || c == cols || grid[r][c] != '1') {
            return;
        }

        grid[r][c] = '2';
        //向上下左右扩展
        marked(r + 1, c, rows, cols, grid);
        marked(r, c + 1, rows, cols, grid);
        marked(r - 1, c, rows, cols, grid);
        marked(r, c - 1, rows, cols, grid);
    }
}
