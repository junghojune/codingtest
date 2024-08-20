import java.util.*;
class Solution {
    public String solution(String s) {
        List<Integer> list  = new ArrayList<>();

        for(String n : s.split(" ")) {
            list.add(Integer.parseInt(n));
        }

        int min = Collections.min(list);
        int max = Collections.max(list);
        
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        return sb.toString();
    }
}