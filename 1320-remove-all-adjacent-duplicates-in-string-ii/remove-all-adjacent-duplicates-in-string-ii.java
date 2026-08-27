class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
                intStack.push(1);
            }
            else if (stack.peek() == ch) {
                stack.push(ch);
                intStack.push(intStack.peek() + 1);
            }
            else if (stack.peek() != ch) {
                stack.push(ch);
                intStack.push(1);
            }

            if (intStack.peek() == k) {
                for (int i = 0; i < k; i++) {
                    stack.pop();
                    intStack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());

        return sb.reverse().toString();
    }
}