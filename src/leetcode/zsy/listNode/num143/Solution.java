package leetcode.zsy.listNode.num143;

import basic.zsy.node.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-13 11:21
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head.next == null || head.next.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        Stack<ListNode> stack = new Stack<>();
        while (head2!=null){
            stack.push(head2);
            head2 = head2.next;
        }
        ListNode tmp = head;
        while (stack.size() != 0){
            ListNode node= stack.pop();
            node.next = tmp.next;
            tmp.next = node;
            tmp = tmp.next.next;
        }
    }


    public void reorderList2(ListNode head) {
        if (head == null) {
            return;
        }
        //存到 list 中去
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        //头尾指针依次取元素
        int i = 0, j = list.size() - 1;
        while (i < j) {
            list.get(i).next = list.get(j);
            i++;
            //偶数个节点的情况，会提前相遇
            if (i == j) {
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }

}
