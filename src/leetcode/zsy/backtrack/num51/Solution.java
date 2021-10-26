package leetcode.zsy.backtrack.num51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-26 14:30
 */
public class Solution {
    public List<List<String>> solveNQueens(int n) {
        String[][] strings = new String[n][n];
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                strings[i][j] = ".";
            }
        }
        List<String> tmp = new ArrayList<>();
        backtrack(strings,res,tmp,n,0);
        return res;
    }

    private void backtrack(String[][] strings, List<List<String>> res,List<String> tmp,int n,int i) {
        if (tmp.size() == n){
            res.add(new ArrayList<>(tmp));
            return;
        }else {
            for (int j = 0; j < n; j++) {
                if (isValid(n,i,j,strings)){
                    strings[i][j] = "Q";
                    List<String> list = Arrays.asList(strings[i]);
                    getTmp(tmp,list);
                    backtrack(strings,res,tmp,n,i+1);
                    strings[i][j] = ".";
                    if (tmp.size()!=0){
                        tmp.remove(tmp.size()-1);
                    }
                }
            }
        }
    }

    private boolean isValid(int n, int i, int j, String[][] strings) {
        for (int k = 0; k < i; k++) {
            if ("Q".equals(strings[k][j])){
                return false;
            }
        }

        for (int k = i-1, p =j-1; k >=0 && p >=0 ; k--,p--) {
            if ("Q".equals(strings[k][p])){
                return false;
            }
        }

        for (int k = i-1, p =j+1; k >=0 && p <=n-1 ; k--,p++) {
            if ("Q".equals(strings[k][p])){
                return false;
            }
        }
        return true;
    }

    private void getTmp(List<String> tmp, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        tmp.add(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solveNQueens(4);
    }
}
