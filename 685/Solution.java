public class Solution {

    private int[] parents;

    // Two cases based on whether or not there is a vertex with indegrees two.
    public int[] findRedundantDirectedConnection(int[][] edges) {

        int n = edges.length;
        int[] indegrees = new int[n];

        // These store the first and the second occurrences of the edges that point to the vertex with indegrees two.
        int first = -1;
        int second = -1;

        // Detect and record.
        for(int i=0; i < n; i++) if(indegrees[edges[i][1] - 1]++ == 1) second = i;
        if(second != -1) {
            first = 0;
            while(edges[first][1] != edges[second][1]) first++;
        }

        // For the case when there is no vertex with indegrees two, we can just remove the last edge within the loop (which has to exist).
        // For the case when there is a vertex with indegrees two, we need to check if removing the second edge would leave the first edge forming a loop.
        // If not, we can just remove the second edge.
        
        parents = new int[n];
        for(int i=0; i < n; i++) parents[i] = i;
        
        for(int i=0; i < n; i++) if(i != second) {
            if(find(edges[i][0] - 1) == find(edges[i][1] - 1)) return first == -1 ? edges[i] : edges[first];
            union(edges[i][0] - 1, edges[i][1] - 1);
        }

        return edges[second];
    }

    private int find(int val) {
        if(val == parents[val]) return val;
        return parents[val] = find(parents[val]);
    }

    private void union(int val1, int val2) {
        parents[find(val1)] = find(val2);
    }

}
