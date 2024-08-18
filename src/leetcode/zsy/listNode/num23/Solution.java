package leetcode.zsy.listNode.num23;

import basic.zsy.node.ListNode;
import java.util.PriorityQueue;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0){
            return null;
        }
        ListNode dummy = new ListNode(-1);

        ListNode p = dummy;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> (a.val - b.val));

        for(ListNode head : lists){
            if (head != null){
                pq.add(head);
            }
        }

        while (!pq.isEmpty()){
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null){
                pq.add(node.next);
            }
            p = p.next;
        }

        return dummy.next;
    }
}
