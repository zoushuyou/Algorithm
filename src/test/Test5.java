package test;

import java.util.*;
import java.util.stream.Collectors;

public class Test5 {
    public List<Character> solution(String str, int n){
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0 ; i < str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i) + 1,0));
        }
        List<Map.Entry<Character, Integer>> infoIds = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue() - o1.getValue());
            }
        });
        for (int i = 0; i < n; i++) {
            list.add(infoIds.get(i).getKey());
        }
        return list;
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.solution("asdasdasdasdzxc",3).forEach(System.out::println);
    }

}
