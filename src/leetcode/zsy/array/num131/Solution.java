package leetcode.zsy.array.num131;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-15 9:28
 */
public class Solution {
    public List<List<String>> partition(String s) {
        return partitionHelper(s,0);
    }

    private List<List<String>> partitionHelper(String s, int start) {
        if (start == s.length()){
            List<String> tmp = new ArrayList<>();
            List<List<String>> res = new ArrayList<>();
            res.add(tmp);
            return res;
        }
        List<List<String>> res = new ArrayList<>();
        for (int i = start; i < s.length(); i++) {
            if (isPartition(s.substring(start,i+1))){
                String left = s.substring(start, i + 1);
                //遍历后边字符串的所有结果，将当前的字符串加到头部
                for (List<String> l : partitionHelper(s, i + 1)) {
                    l.add(0, left);
                    res.add(l);
                }
            }
        }
        return res;
    }

    public boolean isPartition(String s){
        int i = 0 , j = s.length();
        while (i<=j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
