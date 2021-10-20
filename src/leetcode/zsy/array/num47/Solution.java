package leetcode.zsy.array.num47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-20 9:26
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> old = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res,new ArrayList<Integer>(),nums,old);

        return res;
    }


    private void backtrack(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums, ArrayList<Integer> old) {
        if (tmp.size() == nums.length){
            res.add(new ArrayList<>(tmp));
        }else {
            for (int i = 0; i < nums.length; i++) {

                if (old.contains(i)){
                    continue;
                }
                if (i>0 && !old.contains(i-1) && nums[i-1] == nums[i]){
                    continue;
                }
                old.add(i);
                tmp.add(nums[i]);
                backtrack(res,tmp,nums,old);
                old.remove(old.size()-1);
                tmp.remove(tmp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,3};
        Solution solution = new Solution();
        solution.permuteUnique(nums);
    }
}
