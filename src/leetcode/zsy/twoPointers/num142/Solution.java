package leetcode.zsy.twoPointers.num142;

import basic.zsy.node.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-15 16:03
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode res = null;
        Set<ListNode> set = new HashSet<>();

        while (head!=null){
            if (!set.add(head)){
                res = head;
                break;
            }
            head = head.next;
        }
        return res;
    }
}
