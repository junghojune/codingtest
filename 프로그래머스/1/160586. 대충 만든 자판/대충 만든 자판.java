import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> minimumMap = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if(minimumMap.containsKey(keymap[i].charAt(j))){
                    minimumMap.put(keymap[i].charAt(j), Math.min(minimumMap.get(keymap[i].charAt(j)), j+1));
                } else {
                    minimumMap.put(keymap[i].charAt(j), j+1);
                }
            }
        }
        int[] answer = new int[targets.length];

        for(int i = 0; i<targets.length; i++) {
            int cnt = 0;
            for(int j = 0; j < targets[i].length(); j++) {
                if(minimumMap.containsKey(targets[i].charAt(j))){
                    cnt += minimumMap.get(targets[i].charAt(j));
                } else {
                    cnt = -1;
                    break;
                }
            }

            answer[i] = cnt;
        }

        return answer;
    }
}