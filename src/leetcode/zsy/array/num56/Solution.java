package leetcode.zsy.array.num56;

import java.util.*;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-29 9:20
 */
public class Solution {

    public int[][] merge(int[][] intervals){
        if (intervals.length == 0){
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        List<int []> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int L = intervals[i][0], R = intervals[i][1];
            if (merged.isEmpty() || merged.get(merged.size()-1)[1] < L){
                merged.add(intervals[i]);
            }else {
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }


}
