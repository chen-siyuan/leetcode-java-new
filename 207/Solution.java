import java.util.*;

public class Solution {

    public static int n;
    public static List<Integer>[] al;
    public static boolean[] searched;

    public boolean canFinish(int numCourses, int[][] edges) {

        n = numCourses;
        al = new ArrayList[n];
        for(int i=0; i < n; i++) al[i] = new ArrayList<>();
        for(int[] edge: edges) al[edge[0]].add(edge[1]);
        searched = new boolean[n];

        for(int i=0; i < n; i++) if(!searched[i]) search(i);

    }

}
