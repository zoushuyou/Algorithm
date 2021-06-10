package test;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-10 14:05
 */
public class Test {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]*","");
        System.out.println(s);
    }
}
