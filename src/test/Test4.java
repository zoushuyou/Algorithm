package test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        for (int i = 0; i < next.length(); i++) {
            if (next.charAt(i) == '*'){
                res1.append("*");
            }else {
                res2.append(next.charAt(i));
            }
        }
        res1.append(res2);
        System.out.println(res1.toString());
    }
}
