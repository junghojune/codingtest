import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesMap = new HashMap<String, Integer>();

        for(int i = 0; i< clothes.length; i++){
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        if(clothesMap.size() == 1){
            return clothes.length;
        }
        
        for(String clothesKey : clothesMap.keySet()){
            answer *= clothesMap.get(clothesKey) + 1;
        }

        return answer -1 ;
    }
}