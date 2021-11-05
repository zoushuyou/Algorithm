package basic.zsy.node;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-10 14:22
 */
public class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int x){
         val = x;
         next = null;
     }
     ListNode(int val, ListNode next){
         this.val = val;
         this.next = next;
     }
}
