import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, int[][] wires) {
        int min = n;

        for (int i = 0; i < wires.length; i++) {
            // 그래프 초기화
            List<List<Integer>> graph = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                graph.add(new ArrayList<>());
            }

            // 간선 하나 제거하면서 그래프 구성
            for (int j = 0; j < wires.length; j++) {
                if (i == j) continue; // i번째 간선을 끊는다
                int a = wires[j][0];
                int b = wires[j][1];
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            boolean[] visited = new boolean[n + 1];
            int count = dfs(1, graph, visited); // 1번 송전탑에서 시작
            int diff = Math.abs(n - 2 * count);
            min = Math.min(min, diff);
        }

        return min;
    }

    private int dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        int count = 1;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, graph, visited);
            }
        }

        return count;
    }
}