import java.util.*;

public class Solution {

    public static List<Integer>[] al;
    public static int[] id;
    public static Set<Integer> record;

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        al = new ArrayList[n];
        id = new int[n];
        record = new HashSet<>();

        for(int i=0; i < n; i++) al[i] = new ArrayList<>();
        for(int[] edge: edges) {
            al[edge[0]].add(edge[1]);
            al[edge[1]].add(edge[0]);
            id[edge[0]]++;
            id[edge[1]]++;
        }
        for(int i=0; i < n; i++) record.add(i);

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i < n; i++) if(id[i] == 1) queue.offer(i);
        
        while(record.size() > 2) {

            int temp = queue.size();

            for(int i=0; i < temp; i++) {
                record.remove(queue.peek());
                for(int neighbor: al[queue.poll()]) if(--id[neighbor] == 1) queue.offer(neighbor);
            }
        
        }

        return new ArrayList<>(record);
    }

}
