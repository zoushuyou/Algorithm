package test;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        Map treeMap = new TreeMap<Character,Integer>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < next.length(); i++) {
            int x = (int) treeMap.getOrDefault(next.charAt(i),0) + 1;
            treeMap.put(next.charAt(i), x);
        }

        Iterator iterator = treeMap.keySet().iterator();
        String res = "";
        while (iterator.hasNext()){
            Character key = (Character) iterator.next();
            res += key + String.valueOf(treeMap.get(key));
        }
        System.out.println(res);
    }
}
