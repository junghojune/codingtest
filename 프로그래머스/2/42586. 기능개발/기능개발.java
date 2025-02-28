import java.util.*;

class Solution {
     public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();


        for(int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int cnt = 0;
            while(progress < 100){
                progress += speeds[i];
                cnt++;
            }

            queue.add(cnt);
        }

        while(!queue.isEmpty()){
            int minDay = queue.poll();
            int count = 1;

            while(!queue.isEmpty() && queue.peek() <= minDay){
                queue.poll();
                count++;
            }
            
            list.add(count);
        }




        return list;
    }
}