import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        for(String x : X.split("")){
            xMap.put(x, xMap.getOrDefault(x, 0)+1);
        }
        for(String y : Y.split("")){
            yMap.put(y, yMap.getOrDefault(y, 0)+1);
        }

        List<String> list = new ArrayList<>();

        for(String key : xMap.keySet()){
            if(!yMap.containsKey(key)) continue;

            int cnt = Math.min(xMap.get(key), yMap.get(key));
            for(int i = 0; i < cnt; i++) {
                list.add(key);
            }
        }

        if(list.isEmpty()) return "-1";
        
        list.sort(Collections.reverseOrder());

        // 리스트의 요소를 하나의 문자열로 결합
        StringBuilder result = new StringBuilder();
        for (String s : list) {
            result.append(s);
        }

        
        if(result.toString().startsWith("0")) return "0";
        return result.toString();
    }
}