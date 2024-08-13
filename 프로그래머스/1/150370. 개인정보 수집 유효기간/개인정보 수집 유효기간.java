import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for(String i : terms){
            String[] term = i.split(" ");
            map.put(term[0], Integer.parseInt(term[1]));
        }

        for(int i = 0; i < privacies.length; i++){
            String[] privacy = privacies[i].split(" ");
            if(getDate(privacy[0]) + (map.get(privacy[1]) * 28) <= getDate(today)){
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    private int getDate(String day){
        String[] date = day.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int dayOfMonth = Integer.parseInt(date[2]);
        return (year * 12 * 28) + month * 28 + dayOfMonth;
    }
}