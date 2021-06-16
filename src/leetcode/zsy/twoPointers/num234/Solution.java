package leetcode.zsy.twoPointers.num234;

import basic.zsy.node.ListNode;

import java.util.ArrayList;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-16 15:18
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }

        int j = list.size()-1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(j)){
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
