package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-06 18:40
 */
public class Test2 {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        if(S.length == 0){
            return res;
        }
        Arrays.sort(S);
        subset(res,tmp,0,S);
        return res;
    }

    public void subset(List list, ArrayList<Integer> tmp , int start, int[] S){
        list.add(new ArrayList(tmp));
        for(int i = start; i < S.length; i++){
            tmp.add(S[i]);
            subset(list,tmp,i+1,S);
            tmp.remove(tmp.size() - 1);
        }

    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int[] test= {1,2,3};
        test2.subsets(test);
    }
}
