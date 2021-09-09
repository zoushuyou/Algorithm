package leetcode.zsy.array.num37;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-09-10 17:29
 */
public class Solution {
    public void solveSudoku(char[][] board) {
        solver(board);
    }

    private boolean solver(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.'){
                    char count = '1';
                    while (count <= '9'){
                        if (isValid(i,j,board,count)){
                            board[i][j] = count;
                            if (solver(board)){
                                return true;
                            }else {
                                board[i][j] = '.';
                            }
                        }
                        count++;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, char[][] board, char count) {
        for (int k = 0; k < 9; k++) {
            if (board[row][k] == count){
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == count){
                return false;
            }
        }

        int start_row = row / 3 * 3;
        int start_col = col / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[start_row + i][start_col + j] == count) {
                    return false;
                }
            }

        }
        return true;
    }
}
