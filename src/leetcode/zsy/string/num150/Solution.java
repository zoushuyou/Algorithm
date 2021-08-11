package leetcode.zsy.string.num150;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-11 10:41
 */
public class Solution {

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1 ){
            return Integer.parseInt(tokens[0]);
        }
        int i = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        while (i < tokens.length){
            if (!isOp(tokens[i])){
                deque.push(Integer.parseInt(tokens[i]));
            }else {
                int a = deque.pop();
                int b = deque.pop();
                if (tokens[i].equals("+")){
                    deque.push(a+b);
                }else if (tokens[i].equals("-")){
                    deque.push(b-a);
                }else if (tokens[i].equals("*")){
                    deque.push(a*b);
                }else if (tokens[i].equals("/")){
                    deque.push(b/a);
                }
            }
            i++;
        }
        return deque.pop();

    }

    private boolean isOp(String token) {
        if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(solution.evalRPN(tokens));
    }
}
