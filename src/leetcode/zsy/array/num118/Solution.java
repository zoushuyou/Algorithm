package leetcode.zsy.array.num118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-09 11:08
 */
public class Solution {

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        res.add(l1);
        if (numRows == 1){
            return res;
        }
        for (int i = 1; i <numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            List<Integer> level = res.get(i-1);
            tmp.add(1);
            for (int j = 0; j < level.size() - 1; j++) {
                tmp.add(level.get(j) + level.get(j+1));
            }
            tmp.add(1);
            res.add(tmp);
        }
        return res;
    }
}
