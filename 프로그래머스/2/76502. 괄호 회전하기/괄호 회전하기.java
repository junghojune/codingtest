import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            if(verify(s))answer++;
            s = shift(s);
        }

        return answer;
    }

    private static boolean verify(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // 여는 괄호면 스택에 push
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                // 스택이 비어있는 경우
                if (stack.isEmpty()) {
                    return false;
                }

                // 짝이 맞는 괄호면 스택에서 pop
                if (stack.peek() == '(' && s.charAt(i) == ')')  {
                    stack.pop();
                } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                    // 짝이 맞지 않는 경우 false
                } else return false;
            }
        }
        return stack.isEmpty();
    }

    private static String shift(String s){
        return s.substring(1) + s.charAt(0);
    }
}