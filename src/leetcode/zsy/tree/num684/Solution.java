package leetcode.zsy.tree.num684;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-04-27 17:03
 */
public class Solution {
/*
    //图相关 待解
    public int[] findRedundantConnection(int[][] edges) {
        int nodesCount = edges.length;
        int[] parent = new int[nodesCount + 1];
        for (int i = 0; i <= nodesCount; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < nodesCount; i++) {
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            if (find(parent,node1) != find(parent,node2)){

            }
        }
    }

    private int find(int[] parent, int index) {
        if (parent[index] != index){
            parent[index] = find(parent,parent[index]);
        }
        return parent[index];
    }*/
}
