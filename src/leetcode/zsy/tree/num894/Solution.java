package leetcode.zsy.tree.num894;

import basic.zsy.tree.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

    Map<Integer, List<TreeNode>> map = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (!map.containsKey(n)){
            List<TreeNode> res = new LinkedList<>();
            if (n == 1){
                res.add(new TreeNode(0));
            }else if (n % 2 == 1){
                for (int i = 0; i < n; i++) {
                    int y = n-1-i;
                    for (TreeNode left : allPossibleFBT(i)){
                        for (TreeNode right : allPossibleFBT(y)){
                            TreeNode bns = new TreeNode(0);
                            bns.left = left;
                            bns.right = right;
                            res.add(bns);
                        }
                    }
                }
            }
            map.put(n,res);
        }

        return map.get(n);
    }
}
