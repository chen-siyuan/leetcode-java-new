import java.util.*;

public class Solution {

    public static List<Integer>[] al;
    public static boolean[] searched;
    public static Set<Integer> cache;

    public boolean canFinish(int n, int[][] edges) {

        al = new ArrayList[n];
        searched = new boolean[n];
        cache = new HashSet<>();

        for(int i=0; i < n; i++) al[i] = new ArrayList<>();
        for(int[] edge: edges) al[edge[0]].add(edge[1]);

        for(int i=0; i < n; i++) if(!searched[i] && search(i)) return false;
        return true;
    }

    public static boolean search(int index) {

        if(searched[index]) return false;
        if(cache.contains(index)) return true;

        boolean res = false;

        cache.add(index);
        for(int neighbor: al[index]) if(search(neighbor)) return true;
        cache.remove(index);
        searched[index] = true;

        return false;
    }

}
