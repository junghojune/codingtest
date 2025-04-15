class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            if (isValid(places[i])) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }

    // 거리두기 지켜졌는지 검사
    private boolean isValid(String[] place) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (place[r].charAt(c) == 'P') {
                    if (!check(place, r, c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // 해당 위치에서 거리두기 확인
    private boolean check(String[] place, int r, int c) {
        // 상하좌우 방향 (거리 1)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int nr = r + dx[d];
            int nc = c + dy[d];
            if (isIn(nr, nc)) {
                if (place[nr].charAt(nc) == 'P') return false;
            }
        }

        // 대각선 (거리 2)
        int[] diagX = {-1, -1, 1, 1};
        int[] diagY = {-1, 1, -1, 1};
        for (int d = 0; d < 4; d++) {
            int nr = r + diagX[d];
            int nc = c + diagY[d];
            if (isIn(nr, nc) && place[nr].charAt(nc) == 'P') {
                if (!(place[r].charAt(nc) == 'X' && place[nr].charAt(c) == 'X')) {
                    return false;
                }
            }
        }

        // 일직선 2칸 거리
        int[] lineX = {-2, 2, 0, 0};
        int[] lineY = {0, 0, -2, 2};
        for (int d = 0; d < 4; d++) {
            int nr = r + lineX[d];
            int nc = c + lineY[d];
            int mr = r + lineX[d] / 2;
            int mc = c + lineY[d] / 2;

            if (isIn(nr, nc) && place[nr].charAt(nc) == 'P') {
                if (place[mr].charAt(mc) != 'X') {
                    return false;
                }
            }
        }

        return true;
    }

    // 유효한 범위인지 확인
    private boolean isIn(int r, int c) {
        return r >= 0 && r < 5 && c >= 0 && c < 5;
    }
}