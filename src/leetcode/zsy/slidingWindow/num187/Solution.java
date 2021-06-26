package leetcode.zsy.slidingWindow.num187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-26 21:44
 */
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10, n = s.length();
        HashSet<String> seen = new HashSet<>() , output = new HashSet<>();

        for (int start = 0; start < n - L +1; start++) {
            String tmp = s.substring(start, start + L);
            if (seen.contains(tmp)) {
                output.add(tmp);
            }
            seen.add(tmp);
        }
        return new ArrayList<String>(output);
    }
}
