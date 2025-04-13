class Solution {
    public long solution(int k, int d) {
       long answer = 0;
        
        for(int x = 0; x <= d; x += k){
            long maxY = (long) d*d - (long) x * x;
            long sqrtY = (long) Math.sqrt(maxY);
            answer += (sqrtY / k) + 1;
        }
        
        return answer;
    }
}