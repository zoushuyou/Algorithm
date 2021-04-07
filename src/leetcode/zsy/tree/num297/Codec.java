package leetcode.zsy.tree.num297;

import basic.zsy.tree.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Codec {



    public String serialize(TreeNode root){
        return doSerialize(root,"");
    }

    public String doSerialize(TreeNode root, String s){
        if (root == null){
            s += "None,";
        }else {
            s += root.val + ",";
            doSerialize(root.left,s);
            doSerialize(root.right,s);
        }
        return s;
    }

    public TreeNode deserialize(String data){
        String[] array = data.split(",");
        List<String> list = new LinkedList<String>(Arrays.asList(array));
        return doDeserialize(list);
    }

    public TreeNode doDeserialize(List<String> list){
        if (list.get(0).equals("None")) {
            list.remove(0);
            return null;
        }
        TreeNode tmp = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        tmp.left = doDeserialize(list);
        tmp.right = doDeserialize(list);
        return tmp;
    }
}
