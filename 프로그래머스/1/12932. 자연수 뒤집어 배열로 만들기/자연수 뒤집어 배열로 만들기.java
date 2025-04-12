class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n); // 숫자를 문자열로 변환
        int[] answer = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0'; // 뒤에서부터 한 글자씩 숫자로 변환
        }
        
        return answer;
    }
}