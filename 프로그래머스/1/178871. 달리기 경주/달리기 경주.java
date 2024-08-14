import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;


        Map<String, Integer> playerMap = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for(String calling : callings) {
            int rank = playerMap.get(calling);
            String changeRank = answer[rank-1];
            answer[rank-1] = calling;
            answer[rank] = changeRank;
            
            playerMap.put(calling, rank -1);
            playerMap.put(changeRank, rank);
            
        }


        return answer;
    }
}