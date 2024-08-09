import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int yLength = wallpaper[0].length();
        int xLength = wallpaper.length;
        int[] answer = new int[4];
        List<Integer> xList = new ArrayList<>();
        List<Integer> ylist = new ArrayList<>();

        for (int x =0; x<xLength; x++){
            if(wallpaper[x].contains("#")){
                xList.add(x);
                char[] list = wallpaper[x].toCharArray();
                for(int y = 0; y<yLength; y++ ){
                    if(list[y] == '#'){
                        ylist.add(y);
                    }
                }
            }
        }

        answer[0] = Collections.min(xList);
        answer[2] = Collections.max(xList) + 1;

        answer[1] = Collections.min(ylist);
        answer[3] = Collections.max(ylist) + 1;


        return answer;
    }
}