package leetcode.zsy.listNode.num148;

import basic.zsy.node.ListNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-12 13:45
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode tmp = new ListNode(0);
        tmp.next = head;

        ListNode fast = tmp;
        ListNode slow = tmp;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        head = mergeSort(head);
        head2 = mergeSort(head2);

        return merge(head,head2);
    }

    private ListNode merge(ListNode head, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        while (head != null && head2 != null){
            if (head.val < head2.val){
                tmp.next = head;
                tmp = tmp.next;
                head = head.next;
            }else {
                tmp.next = head2;
                tmp = tmp.next;
                head2 = head2.next;
            }
        }

        if (head != null){
            tmp.next = head;
        }

        if (head2 != null){
            tmp.next = head2;
        }

        return dummy.next;
    }
}
