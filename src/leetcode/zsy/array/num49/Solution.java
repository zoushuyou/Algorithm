package leetcode.zsy.array.num49;

import java.util.*;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-10-22 15:49
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map, List<String>> res = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> map = new HashMap<>();
            String s = strs[i];
            for (int j = 0; j < s.length(); j++) {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            }
            if (res.containsKey(map)){
                List<String> list = res.get(map);
                list.add(strs[i]);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                res.put(map,list);
            }
        }
        List<List<String>> lists = new ArrayList<>();
        for(Map map : res.keySet()){
            List<String> list = res.get(map);
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        String[] strs = {"ddddddddddg","dgggggggggg"};
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(strs).toString());
    }
}
