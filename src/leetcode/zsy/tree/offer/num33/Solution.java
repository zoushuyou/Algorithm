package leetcode.zsy.tree.offer.num33;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-13 9:54
 */
public class Solution {

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }

    private boolean recur(int[] postorder, int i, int j) {
        if (i >= j){
            return true;
        }
        int p = i;
        while (postorder[p]<=postorder[j]){
            p++;
        }
        int m =p;
        while (postorder[p]>=postorder[j]){
            p++;
        }
        return p==j && recur(postorder,i,m-1) && recur(postorder,m,j-1);
    }
}
