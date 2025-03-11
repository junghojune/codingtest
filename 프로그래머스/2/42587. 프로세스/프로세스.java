import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 우선순위를 큐에 넣어
        // 내가 찾고 싶은 프로세스의 순서를 찾아야 해
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int priority : priorities) {
            queue.add(priority);
        }


        while(!queue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}