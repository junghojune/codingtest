import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static int n, m;
    static String[] maps;

    public int[] solution(String[] mapsInput) {
        maps = mapsInput;
        n = maps.length;
        m = maps[0].length();
        visited = new boolean[n][m];

        List<Integer> islandFood = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && maps[i].charAt(j) != 'X') {
                    int food = dfs(i, j);
                    islandFood.add(food);
                }
            }
        }

        if (islandFood.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(islandFood);
        return islandFood.stream().mapToInt(i -> i).toArray();
    }

    private int dfs(int y, int x) {
        visited[y][x] = true;
        int sum = maps[y].charAt(x) - '0';

        for (int dir = 0; dir < 4; dir++) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
            if (visited[ny][nx]) continue;
            if (maps[ny].charAt(nx) == 'X') continue;

            sum += dfs(ny, nx);
        }

        return sum;
    }
}