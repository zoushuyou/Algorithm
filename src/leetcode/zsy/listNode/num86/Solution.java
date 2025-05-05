package leetcode.zsy.listNode.num86;


import basic.zsy.node.ListNode;

public class Solution {
/*    public ListNode partition(ListNode head, int x) {
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
    }*/
    public ListNode partition(ListNode head, int x) {
        ListNode min = new ListNode(-1);
        ListNode max = new ListNode(-1);

        ListNode minTmp = min;
        ListNode maxTmp = max;
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.val >= x){
                maxTmp.next = tmp;
                maxTmp = maxTmp.next;
            } else{
                minTmp.next = tmp;
                minTmp = minTmp.next;
            }
            tmp = tmp.next;
        }
        maxTmp.next = null;
        minTmp.next = max.next;
        return min.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        Solution solution = new Solution();
        ListNode listNode = solution.partition(head, 3);
    }

}
