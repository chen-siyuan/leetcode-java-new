import java.util.*;

public class Solution {

    public static List<Integer>[] al;
    public static int[] id;
    public static int[] res;
    public static int count;

    public int[] findOrder(int n, int[][] edges) {

        al = new ArrayList[n];
        id = new int[n];
        res = new int[n];
        count = 0;

        for(int i=0; i < n; i++) al[i] = new ArrayList<>();
        for(int[] edge: edges) {
            al[edge[1]].add(edge[0]);
            id[edge[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i < n; i++) if(id[i] == 0) queue.offer(i);

        while(!queue.isEmpty()) {
            res[count++] = queue.poll();
            for(int neighbor: al[res[count - 1]]) if(--id[neighbor] == 0) queue.offer(neighbor);
        }

        return count == n ? res : new int[0];
    }

}
