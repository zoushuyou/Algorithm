package leetcode.zsy.string.num78;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-03 10:15
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> ans_tmp = new ArrayList<>();
            for (List<Integer> list : res){
                List<Integer> tmp = new ArrayList<>(list);
                tmp.add(nums[i]);
                ans_tmp.add(tmp);
            }
            res.addAll(ans_tmp);
        }
        return res;
    }


    public List<List<Integer>> subsets2(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        getAns(res,nums,new ArrayList<>(),0);
        return res;
    }

    private void getAns(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp, int i) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            getAns(res,nums,tmp,i+1);
            tmp.remove(tmp.size()-1);
        }
    }


}
