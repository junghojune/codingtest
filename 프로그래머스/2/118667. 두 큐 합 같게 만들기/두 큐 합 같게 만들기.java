import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = 0, sum2 = 0;
        int n = queue1.length;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }

        long target = (sum1 + sum2);
        if (target % 2 != 0) return -1;
        target /= 2;

        int count = 0;
        int maxCount = n * 3;

        while(count < maxCount) {
            if(sum1 == target) {return count;}
            
            if(sum1 > sum2) {
                int num = q1.poll();
                sum1 -= num;
                q2.offer(num);
                sum2 += num;
            } else {
                int num = q2.poll();
                sum2 -= num;
                q1.offer(num);
                sum1 += num;
            }
            
            count++;
        }
        
        return -1;
    }
}