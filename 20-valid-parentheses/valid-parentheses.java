class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false;
                char recentChar = stack.pop();

                if (ch == ')' && recentChar != '(' || ch == '}' && recentChar != '{' || ch == ']' && recentChar != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}