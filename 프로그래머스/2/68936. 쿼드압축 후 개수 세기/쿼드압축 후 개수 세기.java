class Solution {
    int[] result = new int[2];

    public int[] solution(int[][] arr) {
        recursion(arr, 0, 0, arr.length);
        return result;
    }


    private void recursion(int[][] arr, int x, int y, int size) {
        if(isSame(arr, x, y, size)) {
            result[arr[x][y]] += 1;
            return;
        }

        int half = size / 2;
        // 왼쪽 위
        recursion(arr, x, y, half);
        // 오른쪽 위
        recursion(arr, x, y + half, half);
        recursion(arr, x + half, y, half);
        recursion(arr, x + half, y + half, half);

    }

    private boolean isSame(int[][] arr, int x, int y, int size) {
        int base = arr[x][y];
        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(base != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}