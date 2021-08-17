package leetcode.zsy.string.num30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-27 14:37
 */
public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int wordNum = words.length;
        if (wordNum == 0){
            return res;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < wordNum; i++) {
            map.put(words[i], map.getOrDefault(words[i],0) + 1);
        }

        int len = words[0].length();
        int slen = len * wordNum;
        for (int i = 0; i <= s.length() - slen; i++) {
            int j = i;
            HashMap<String, Integer> smap = new HashMap<>();
            while (j < i+slen){
                String word = s.substring(j,j+len);
                if (map.containsKey(word)){
                    if (smap.getOrDefault(word,0) > map.get(word)){
                        break;
                    }
                    smap.put(word, smap.getOrDefault(word,0) + 1);
                }else {
                    break;
                }
                j += len;
            }
            if (smap.equals(map)){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        solution.findSubstring(s,words);
    }
}
