package basic.zsy.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Order {

    public void preOrder(TreeNode root){
        if (root == null){
            return;
        }

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.println(root.val);
    }

    public void BFSOrder(TreeNode root){
        if (root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode temp = null;
        queue.offer(root);
        while (!queue.isEmpty()){
            temp = queue.poll();
            System.out.println(temp.val);
            if (temp.left != null){
                queue.offer(temp.left);
            }
            if (temp.right != null){
                queue.offer(temp.right);
            }
        }
    }

    public void preorderTraversal(TreeNode root){

        Deque<TreeNode> deque = new LinkedList<>();
        while (!deque.isEmpty() || root != null){
            if (root != null){
                System.out.println(root.val);
                deque.push(root);
                root =root.left;
            }else {
                TreeNode tmp = deque.pop();
                root = tmp.right;
            }
        }
    }

    public void inorderTraversal(TreeNode root){

        Deque<TreeNode> deque = new LinkedList<>();
        while (!deque.isEmpty() || root != null){
            if (root != null){
                deque.push(root);
                root =root.left;
            }else {
                TreeNode tmp = deque.pop();
                System.out.println(tmp.val);
                root = tmp.right;
            }
        }
    }



}
