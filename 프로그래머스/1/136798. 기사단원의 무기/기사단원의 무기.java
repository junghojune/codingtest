class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int index = 1;
        while (index <= number) {
            int count = 0;
            for(int i = 1; i * i <= index; i++){
                if(i * i == index){
                    count++;
                } else if (index % i == 0) {
                    count += 2;
                }
            }
            if(count > limit){
                answer += power;
            } else {
                answer += count;
            }
            
            index++;
        }

        return answer;
    }
}