/**
 * leetcode13_4_2024
 */
import java.util.*;
public class leetcode13_4_2024 {

    public static void main(String[] args) {
        
    }
    
    class Solution {
        public int[] minimumTime(int n, int[][] edges, int[] disappear) {
            Map<Integer, List<int[]>> g = new HashMap<>();
            for (int[] e : edges) {
                int u = e[0], v = e[1], time = e[2];
                g.putIfAbsent(u, new ArrayList<>());
                g.putIfAbsent(v, new ArrayList<>());
                g.get(u).add(new int[] { v, time });
                g.get(v).add(new int[] { u, time });
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            pq.offer(new int[] { 0, 0 }); 

            int[] answer = new int[n];
            Arrays.fill(answer, -1);

            while (!pq.isEmpty()) {
                int[] current = pq.poll();
                int nd = current[0], time = current[1];
                if (answer[nd] != -1)
                    continue;

                answer[nd] = time;
                if (g.containsKey(nd)) {
                    for (int[] neighbor : g.get(nd)) {
                        int nextNode = neighbor[0], nextTime = neighbor[1];
                        if (answer[nextNode] == -1 && time + nextTime < disappear[nextNode]) {
                            pq.offer(new int[] { nextNode, time + nextTime });
                        }
                    }
                }
            }

            return answer;
        }
    }
}
