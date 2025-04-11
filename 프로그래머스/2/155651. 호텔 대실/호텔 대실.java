import java.util.*;
class Solution {
    
    public int solution(String[][] book_time) {
    // 1. 예약 시간 [시작, 종료+10분]을 분 단위로 변환
        int[][] times = new int[book_time.length][2];
        for (int i = 0; i < book_time.length; i++) {
            times[i][0] = toMinutes(book_time[i][0]);
            times[i][1] = toMinutes(book_time[i][1]) + 10; // 청소 시간 추가
        }

        // 2. 시작 시간 기준 정렬
        Arrays.sort(times, Comparator.comparingInt(a -> a[0]));

        // 3. 최소 힙을 사용해서 객실 종료 시간 관리
        PriorityQueue<Integer> roomEndTimes = new PriorityQueue<>();

        for (int[] time : times) {
            int start = time[0];
            int end = time[1];

            // 가장 빠른 종료 시간이 현재 시작보다 작거나 같으면 재사용 가능
            if (!roomEndTimes.isEmpty() && roomEndTimes.peek() <= start) {
                roomEndTimes.poll(); // 사용한 객실 제거
            }

            roomEndTimes.offer(end); // 현재 예약의 종료 시간 넣기
        }

        // 힙에 남아있는 객실 수가 필요한 최소 객실 수
        return roomEndTimes.size();
    }

    private int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}