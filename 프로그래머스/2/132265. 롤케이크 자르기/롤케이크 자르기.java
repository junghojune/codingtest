import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> lMap = new HashMap<>();
        Map<Integer, Integer> rMap = new HashMap<>();
        for(int t : topping) {
            rMap.put(t, rMap.getOrDefault(t, 0) + 1);
        }
        
        for(int i = 0; i < topping.length - 1; i++) {
            int currentTopping = topping[i];
            lMap.put(currentTopping, lMap.getOrDefault(currentTopping, 0) + 1);
            rMap.put(currentTopping, rMap.get(currentTopping) -1);
            
            if(rMap.get(currentTopping) == 0) {
                rMap.remove(currentTopping);
            }
            
            if(lMap.size() == rMap.size()) {
                answer++;
            }
            
        }
        return answer;
    }
}