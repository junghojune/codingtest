import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        for (int i : list) {
            if (cnt + i >= k) {
                answer++;
                break;
            } else {
                cnt += i;
                answer++;
            }
        }

        return answer;
    }
}