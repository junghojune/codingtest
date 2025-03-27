class Solution {
    public int[] solution(int n) {
        // 총 채워야 할 숫자의 개수
        int total = n * (n + 1) / 2;
        
        // 삼각형 모양의 2차원 배열 초기화: i번째 행은 길이가 i+1
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
        }
        
        // 이동 방향: 아래, 오른쪽, 대각선 위쪽
        int[] dr = {1, 0, -1};
        int[] dc = {0, 1, -1};
        
        int row = 0, col = 0;  // 시작 위치
        int num = 1;           // 채울 숫자
        int d = 0;             // 현재 이동 방향 (0: 아래, 1: 오른쪽, 2: 대각선 위)
        
        // 1부터 total까지 채워나감
        while (num <= total) {
            triangle[row][col] = num++;
            
            int nextRow = row + dr[d];
            int nextCol = col + dc[d];
            
            // 다음 위치의 유효성 검사: 
            // - 행의 범위 내 (0 <= nextRow < n)
            // - 열의 범위 내 (0 <= nextCol <= nextRow)
            // - 아직 숫자가 채워지지 않은 경우
            if (nextRow < n && nextCol >= 0 && nextCol <= nextRow && triangle[nextRow][nextCol] == 0) {
                row = nextRow;
                col = nextCol;
            } else {
                // 방향 전환 후 이동
                d = (d + 1) % 3;
                row += dr[d];
                col += dc[d];
            }
        }
        
        // 2차원 삼각형 배열을 1차원 배열로 변환
        int[] result = new int[total];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                result[index++] = triangle[i][j];
            }
        }
        
        return result;
    }
}