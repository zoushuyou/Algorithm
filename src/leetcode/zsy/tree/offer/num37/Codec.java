package leetcode.zsy.tree.offer.num37;

import basic.zsy.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-05-14 11:12
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder("[");
        if (root == null){
            return "[]";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){

            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                if (node!=null){
                    s.append(node.val + ",");
                    queue.offer(node.left);
                    queue.offer(node.right);
                }else {
                    s.append("null,");
                }

            }
        }
        s.deleteCharAt(s.length() - 1);
        s.append("]");
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")){
            return null;
        }
        String[] vals = data.substring(1,data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        int i = 1;
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if(!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}
