package leetcode.zsy.twoPointers.num141;

import basic.zsy.node.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-10 14:21
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }


    public boolean hasCycle2(ListNode head){
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
