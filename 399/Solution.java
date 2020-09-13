import java.util.*;

public class Solution {

    private Map<String, Map<String, Double>> map;

    public double[] calcEquation(List<List<String>> edges, double[] vals, List<List<String>> queries) {

        map = new HashMap<>();
        int count = 0;

        for(List<String> edge: edges) {

            if(!map.containsKey(edge.get(0))) map.put(edge.get(0), new HashMap<>());
            map.get(edge.get(0)).put(edge.get(1), vals[count]);

            if(!map.containsKey(edge.get(1))) map.put(edge.get(1), new HashMap<>());
            map.get(edge.get(1)).put(edge.get(0), 1. / vals[count++]);

        }

        double[] res = new double[queries.size()];
        count = 0;

        for(List<String> query: queries) res[count++] = search(query.get(0), query.get(1));

        return res;
    }

    private double search(String head, String tail) {
    
        if(!map.containsKey(head) || !map.containsKey(tail)) return -1.;
            
        Queue<String> sq = new LinkedList<>();
        Queue<Double> dq = new LinkedList<>();
        Set<String> searched = new HashSet<>();

        sq.offer(head);
        dq.offer(1.);

        while(!sq.isEmpty()) {
        
            String curr = sq.poll();
            double val = dq.poll();

            if(searched.contains(curr)) continue;
            searched.add(curr);

            if(curr.equals(tail)) return val;

            for(String neighbor: map.get(curr).keySet()) if(!searched.contains(neighbor)) {
                sq.offer(neighbor);
                dq.offer(val * map.get(curr).get(neighbor));
            }
        
        }

        return -1.;
    }

}
