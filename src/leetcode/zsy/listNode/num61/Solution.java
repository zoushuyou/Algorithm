package leetcode.zsy.listNode.num61;

import basic.zsy.node.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        int l = 0;
        ListNode dummy = new ListNode(-1,head);
        ListNode tmp = dummy;
        while(tmp.next != null){
            tmp = tmp.next;
            l++;
        }
        int t= l -(k % l) ;
        if(t == l){
            return dummy.next;
        }
        ListNode end = tmp;
        tmp = dummy;
        for(int i = 0; i< t; i++){
            tmp = tmp.next;
        }
        ListNode s = tmp.next;
        end.next = dummy.next;
        tmp.next = null;
        dummy.next = s;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        ListNode listNode = solution.rotateRight(head, 2);
        System.out.println(listNode);
    }
}
