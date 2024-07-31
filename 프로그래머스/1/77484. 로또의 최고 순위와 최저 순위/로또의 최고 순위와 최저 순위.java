class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int zero = 0;
        int match = 0;
        
        for(int lotto : lottos){
            if(lotto == 0){
                zero++;
            }else {
                for(int winNum : win_nums){
                    if(lotto == winNum){
                        match++;
                        break;
                    }
                }
            }
        }
        
        
        int lowRank = 7 - match;
        int highRank = 7 - (match + zero);
        
        if(lowRank > 6) {lowRank = 6;}
        if(highRank > 6) {highRank = 6;}
        
        int[] answer = {highRank, lowRank};
        
        return answer;
    }
}