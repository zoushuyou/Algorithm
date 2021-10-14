package leetcode.zsy.array.num39;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-14 17:03
 */
public class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),candidates,target,0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> objects, int[] candidates, int remain, int start) {
        if (remain < 0){
            return;
        }else if (remain == 0){
            list.add(new ArrayList<>(objects));
        }else {
            for (int i = start; i < candidates.length; i++){
                objects.add(candidates[i]);
                backtrack(list,objects,candidates,remain - candidates[i],i);
                objects.remove(objects.size()-1);
            }
        }
    }
}
