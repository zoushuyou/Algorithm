package leetcode.zsy.tree.num501;

import basic.zsy.tree.TreeNode;

import java.util.*;

public class Solution {

    int base, count, maxCount;
    List<Integer> answer = new ArrayList<Integer>();

    public int[] findMode(TreeNode root) {
        TreeNode cur = root, pre = null;
        while (cur != null) {
            if (cur.left == null) {
                update(cur.val);
                cur = cur.right;
                continue;
            }
            pre = cur.left;
            while (pre.right != null && pre.right != cur) {
                pre = pre.right;
            }
            if (pre.right == null) {
                pre.right = cur;
                cur = cur.left;
            } else {
                pre.right = null;
                update(cur.val);
                cur = cur.right;
            }
        }
        int[] mode = new int[answer.size()];
        for (int i = 0; i < answer.size(); ++i) {
            mode[i] = answer.get(i);
        }
        return mode;
    }

    public void update(int x) {
        if (x == base) {
            ++count;
        } else {
            count = 1;
            base = x;
        }
        if (count == maxCount) {
            answer.add(base);
        }
        if (count > maxCount) {
            maxCount = count;
            answer.clear();
            answer.add(base);
        }
    }




/*    public int[] findMode(TreeNode root) {
        if(root == null) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root,map);

        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        int max = 0;
        List<Integer> tmp = new ArrayList<Integer>();
        int i = 0;
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if (max < entry.getValue()){
                max = entry.getValue();
            }

        }
        Iterator<Integer> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()){
            int key = iterator2.next();
            if (max == map.get(key)){
                tmp.add(key);
            }
            i++;
        }
        int[] res = new int[tmp.size()];
        for (int j = 0; j < tmp.size(); j++) {
            res[j] = tmp.get(j);
        }

        return res;
    }

    private void dfs(TreeNode root, Map<Integer, Integer> map) {
        if (root == null){
            return;
        }
        if (map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }else {
            map.put(root.val,1);
        }
        dfs(root.left,map);
        dfs(root.right,map);
    }*/
}
