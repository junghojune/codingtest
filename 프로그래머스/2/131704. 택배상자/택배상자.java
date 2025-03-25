import java.util.Stack;

class Solution {
    public int solution(int[] order) {
         int n = order.length;
        int expectIndex = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 1; i<= n; i++) {
            if(i == order[expectIndex]) {
                expectIndex++;
                
                while(!stack.isEmpty() && expectIndex < n && stack.peek() == order[expectIndex]) {
                    stack.pop();
                    expectIndex++;
                }
            } else {
                stack.push(i);
            }
        }

        
        return expectIndex;
    }
}