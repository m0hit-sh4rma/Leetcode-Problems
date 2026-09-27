class Solution {
    public String reverseParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty() || ch != ')') stack.push(ch);
            else {
                StringBuilder sb = new StringBuilder();
                while (stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();

                for (int i = 0; i < sb.length(); i++) stack.push(sb.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) ans.append(stack.pollLast());

        return ans.toString();
    }
}