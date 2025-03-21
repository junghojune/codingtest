import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> brigeQueue = new LinkedList<>();

        int time = 0;
        int totalWeight = 0;
        int idx = 0;
        
        for(int i = 0; i < bridge_length; i++) {
            brigeQueue.add(0);
        }
        
        while(idx < truck_weights.length) {
            // 1초 경과
            time++;
            
            int left = brigeQueue.poll();
            totalWeight -= left;
            
            if(totalWeight + truck_weights[idx] <= weight) {
                brigeQueue.add(truck_weights[idx]);
                totalWeight += truck_weights[idx];
                idx++;
            } else {
                brigeQueue.add(0);
            }
        }

        
        return time + bridge_length;
    }
}