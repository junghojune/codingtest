class Solution {
    public String solution(String s, String skip, int index) {
         String answer = "";
        // s만큼 돌아주기
        for (char str : s.toCharArray()) {
            // index 더한만큼의 배열 만들기
            for(int i=1; i<=index; i++) {
                str += 1;

                if(str > 'z'){
                    str -= 26;
                }

                if(skip.contains(String.valueOf(str))){
                    i--;
                }
            }
            answer += str;
        }
        return answer;
    }
}