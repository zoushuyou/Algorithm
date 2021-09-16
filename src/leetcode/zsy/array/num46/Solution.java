package leetcode.zsy.array.num46;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-19 9:12
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(res,new ArrayList<Integer>(), nums);

        return res;
    }

    private void backtrack(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums) {
        if (tmp.size() == nums.length){
            res.add(new ArrayList<>(tmp));
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (tmp.contains(nums[i])){
                    continue;
                }
                tmp.add(nums[i]);
                backtrack(res,tmp,nums);
                tmp.remove(tmp.size()-1);
            }
        }
    }

}
