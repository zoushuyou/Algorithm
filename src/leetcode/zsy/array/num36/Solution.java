package leetcode.zsy.array.num36;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-09-01 17:26
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<String>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if (number != '.'){
                    if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in block " + i/3 + "-" + j/3) )
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public boolean isValidSudoku2(char[][] board) {
        //判断每一行
        for (int i = 0; i < 9; i++) {
            if (!isValidRows(board[i])) {
                return false;
            }
        }
        //判断每一列
        for (int i = 0; i < 9; i++) {
            if (!isValidCols(i, board)) {
                return false;
            }
        }
        //判断每个小棋盘
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                if (!isValidSmall(i, j, board)) {
                    return false;
                }
            }

        }
        return true;
    }

    public boolean isValidRows(char[] board) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : board) {
            if (c != '.') {
                if (hashMap.getOrDefault(c, 0) != 0) {
                    return false;
                } else {
                    hashMap.put(c, 1);
                }
            }
        }
        return true;
    }

    public boolean isValidCols(int col, char[][] board) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            char c = board[i][col];
            if (c != '.') {
                if (hashMap.getOrDefault(c, 0) != 0) {
                    return false;
                } else {
                    hashMap.put(c, 1);
                }
            }
        }
        return true;
    }

    public boolean isValidSmall(int row, int col, char[][] board) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = board[row + i][col + j];
                if (c != '.') {
                    if (hashMap.getOrDefault(c, 0) != 0) {
                        return false;
                    } else {
                        hashMap.put(c, 1);
                    }
                }
            }
        }
        return true;
    }

}
