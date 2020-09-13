public class Solution {
    
    private int[] id;
    
    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;

        id = new int[n];
        for(int i=0; i < n; i++) id[i] = i;

        for(int i=0; i < n; i++) {
            if(find(edges[i][0] - 1) == find(edges[i][1] - 1)) return edges[i];
            union(edges[i][0] - 1, edges[i][1] - 1);
        }

        return null;
    }

    private int find(int val) {
        if(id[val] == val) return val;
        return find(id[val]);
    }

    private void union(int a, int b) {
        id[find(a)] = find(b);
    }

}
