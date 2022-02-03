package nowcoder.zsy.NC78;


import basic.zsy.node.ListNode;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode curNext= cur.next;

            cur.next = pre;

            pre = cur;

            cur = curNext;
        }
        return pre;
    }

    private ListNode reverse(ListNode cur,ListNode pre){
        if(cur == null){  //当前节点为null时，返回
            return pre;
        }
        ListNode node = reverse(cur.next,cur);  //递归下一个节点
        cur.next = pre;    //当前节点指向前一个节点
        return node;
    }

}
