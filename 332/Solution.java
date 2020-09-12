import java.util.*;

public class Solution {

    private List<String> res;
    private Map<String, PriorityQueue<String>> map;

    public List<String> findItinerary(List<List<String>> edges) {
    
        res = new ArrayList<>();
        map = new HashMap<>();

        for(List<String> edge: edges) {
            if(!map.containsKey(edge.get(0))) map.put(edge.get(0), new PriorityQueue<>());
            map.get(edge.get(0)).offer(edge.get(1));
        }

        search("JFK");

        return res;
    }

    private void search(String curr) {
        PriorityQueue<String> pq = map.get(curr);
        while(pq != null && pq.size() != 0) search(pq.poll());
        res.add(0, curr);
    }

}
