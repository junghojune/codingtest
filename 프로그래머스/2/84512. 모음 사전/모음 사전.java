import java.util.ArrayList;
import java.util.List;

class Solution {
    static String[] gathers = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();

    public static int solution(String word) {
        int answer = 0;
        dfs("", 0);
        
        for(int i =0; i<list.size(); i++) {
            if(list.get(i).equals(word)) {
                return i;
            }
        }
        
        return -1;
    }

    static void dfs(String word, int len){
        list.add(word);
        if(len == 5) return;
        for(int i = 0; i < 5; i++){
            dfs(word + gathers[i], len+1);
        }

    }
}