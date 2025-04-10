import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
   public int solution(int N, int[][] road, int K) {
        int answer = 0;
        List<List<Node>> graph = new ArrayList<>();

        for(int i = 0; i<= N; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] r : road){
            int a = r[0], b = r[1], c = r[2];
            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        // 다익스트라 시작
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, 0));

        while(!pq.isEmpty()){
            Node current = pq.poll();
            if(current.time > dist[current.vertex]) continue;

            for(Node neighbor : graph.get(current.vertex)){

                int newDist = dist[current.vertex] + neighbor.time;

                if(newDist < dist[neighbor.vertex]){
                    dist[neighbor.vertex] = newDist;
                    pq.offer(new Node(neighbor.vertex, newDist));
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) answer++;
        }

        return answer;
    }


    static class Node implements Comparable<Node>{
        int vertex;
        int time;

        Node(int vertex, int time) {
            this.vertex = vertex;
            this.time = time;
        }

        @Override
        public int compareTo(Node other) {
            return this.time - other.time;
        }
    }
}