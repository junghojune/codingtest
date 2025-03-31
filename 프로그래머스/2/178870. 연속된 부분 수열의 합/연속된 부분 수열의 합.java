class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        
        int sum = sequence[0];
        int start = 0, end = 0;
        while(left <= right && right < n) {
            if(sum < k){
                right++;
                if(right < n){
                    sum += sequence[right];
                }
            } else if(sum > k){
                sum -= sequence[left];
                left++;
            } else {
                int length = right - left;
                if(length < minLength){
                    minLength = length;
                    start = left;
                    end = right;
                }
                
                sum -= sequence[left];
                left++;
            }
            
        }

        return new int[]{start, end};
    }
}