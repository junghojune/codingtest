class Solution {
    public int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, target, numbers, 0);
        return answer;
    }

    public void dfs(int depth, int target, int[] numbers, int sum) {
        if(depth == numbers.length) {
            if(target == sum){
                answer++;
            }
            
            return;
        }
        dfs(depth + 1, target, numbers, sum + numbers[depth]);
        dfs(depth + 1, target, numbers, sum - numbers[depth]);
    }
}