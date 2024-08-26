class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;

        while(!s.equals("1")){
            int length = 0;

            for(char cha : s.toCharArray()){
                if(cha == '0'){
                    count++;
                } else {
                    length++;
                }
            }

            zero++;

            s = Integer.toBinaryString(length);
        }

        answer[0] = zero;
        answer[1] = count;
        
        return answer;
    }
}