import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> list = new Stack<>();

        for(int i : ingredient) {
            list.add(i);

            if(list.size() >= 4) {
                int size = list.size();
                if(list.get(size - 4) == 1 &&
                        list.get(size - 3) == 2 &&
                        list.get(size - 2) == 3 &&
                        list.get(size - 1) == 1 ) {
                    answer++;
                    list.pop();
                    list.pop();
                    list.pop();
                    list.pop();
                }
            }
        }

        return answer;
    }
}