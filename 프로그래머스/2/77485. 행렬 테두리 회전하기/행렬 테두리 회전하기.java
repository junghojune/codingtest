import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        int[][] matrix = new int[rows][columns];
        int num = 1;
        for(int x = 0; x < rows; x++) {
            for(int y = 0; y < columns; y++) {
                matrix[x][y] = num++;
            }
        }



        for(int[] query : queries) {
            int x1 = query[0] -1;
            int y1 = query[1] -1;
            int x2 = query[2] -1;
            int y2 = query[3] -1;

            int prev = matrix[x1][y1];
            int min = prev;

            // 테투리 위쪽
            for(int y = y1 + 1; y<= y2; y++) {
                int temp = matrix[x1][y];
                matrix[x1][y] = prev;
                prev = temp;
                min = Math.min(min, prev);
            }

            // 오른쪽
            for(int x = x1 + 1; x <= x2; x++) {
                int temp = matrix[x][y2];
                matrix[x][y2] = prev;
                prev = temp;
                min = Math.min(min, prev);
            }

            // 아래쪽
            for(int y = y2 -1; y >= y1; y--) {
                int temp = matrix[x2][y];
                matrix[x2][y] = prev;
                prev = temp;
                min = Math.min(min, prev);
            }

            // 왼쪽
            for(int x = x2 -1; x >= x1; x--) {
                int temp = matrix[x][y1];
                matrix[x][y1] = prev;
                prev = temp;
                min = Math.min(min, prev);
            }

            result.add(min);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}