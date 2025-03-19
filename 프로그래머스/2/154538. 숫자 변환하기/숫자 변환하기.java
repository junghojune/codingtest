import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
if(x == y){
            return 0;
        }

        if(x > y){
            return -1;
        }

        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(new int[]{x, 0});
        visited.add(x);

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int num = cur[0];
            int count = cur[1];

            int[] nextNums = {num + n, num * 2, num *3};

            for(int next : nextNums){
                if(next == y) return count + 1;
                if(next < y && !visited.contains(next)){
                    queue.offer(new int[]{next, count + 1});
                    visited.add(next);
                }
            }
        }

        return -1;
    }
}