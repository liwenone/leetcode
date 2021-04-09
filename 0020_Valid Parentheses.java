import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && c != ')') || (top == '[' && c != ']') || (top == '{' && c != '}')) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}