package leetcode.zsy.design.num146;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-08-10 10:30
 */
public class LRUCache {

    private Map<Integer, MyNode> map = new HashMap<>();
    private DoubleLinkedList list = new DoubleLinkedList();
    private Integer capacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)){
            MyNode node = map.get(key);
            list.moveToTail(node);
            return (int) node.value;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            MyNode myNode = map.get(key);
            myNode.value = value;
            list.moveToTail(myNode);
        }else {
            if (map.size() == this.capacity){
                MyNode head = list.getFirst();
                map.remove((int) head.key);
                list.removeMyNode(head);

                MyNode node = new MyNode(key,value);
                map.put(key,node);
                list.add(node);
            }else {
                MyNode node = new MyNode(key,value);
                map.put(key,node);
                list.add(node);
            }
        }
    }

    private class MyNode {
        Object key;
        Object value;
        MyNode prev = null;
        MyNode next = null;
        MyNode(Object k, Object v) {
            key = k;
            value = v;
        }
    }

    private class DoubleLinkedList {
        private MyNode head = new MyNode(null,null);
        private MyNode tail = head;

        public void add(MyNode myNode) {
            tail.next = myNode;
            myNode.prev = tail;
            tail = myNode;
        }

        public MyNode getFirst(){
            return head.next;
        }

        public MyNode getTail(){
            return tail;
        }

        public void removeMyNode(MyNode myNode){
            myNode.prev.next = myNode.next;
            if (myNode.next != null){
                myNode.next.prev = myNode.prev;
            }else {
                tail = myNode.prev;
            }
            //全部指向 null
            myNode.prev = null;
            myNode.next = null;
        }

        //移动当前节点到末尾
        public void moveToTail(MyNode myNode) {
            removeMyNode(myNode);
            add(myNode);
        }
    }
}
