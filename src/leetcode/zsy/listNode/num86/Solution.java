package leetcode.zsy.listNode.num86;


import basic.zsy.node.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        ListNode p1 = new ListNode(-1);
        ListNode p2 = new ListNode(-1);
        ListNode p3 = p1;
        ListNode p4 = p2;
        while (p != null){
            if (p.val < x){
                p3.next =p;
                p3 = p;
            }else {
                p4.next = p;
                p4 = p;
            }
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        p3.next = p2.next;
        return  p1.next;
    }
}
