package leetcode.zsy.tree.num109;

import basic.zsy.node.ListNode;
import basic.zsy.tree.TreeNode;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-11-05 9:37
 */
public class Solution {
/*    public TreeNode sortedListToBST(ListNode head){
        TreeNode res = new TreeNode(Integer.MIN_VALUE);
        if (head == null){
            return res;
        }
        while (head != null){
            bst(head.val,res);
            head = head.next;
        }
        return res;
    }

    private void bst(int val, TreeNode res) {
        if (res.val == Integer.MIN_VALUE){
            res.val = val;
        } else {
            if (val >= res.val){
                if (res.right == null){
                    res.right = new TreeNode(val);
                }else {
                    bst(val,res.right);
                }
            }else {
                if (res.left == null){
                    res.left = new TreeNode(val);
                }else {
                    bst(val,res.left);
                }
            }
        }
    }*/

    public TreeNode sortedListToBST(ListNode head){
        return sortedArrayToBST(head,null);
    }

    private TreeNode sortedArrayToBST(ListNode head, ListNode tail) {
        if (head == tail){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedArrayToBST(head,slow);
        root.right = sortedArrayToBST(slow.next,tail);
        return root;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(-10);
        listNode.next = new ListNode(-3);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(5);
        listNode.next.next.next.next = new ListNode(9);
        Solution solution = new Solution();
        solution.sortedListToBST(listNode);
    }
}
