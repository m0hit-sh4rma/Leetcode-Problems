class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count != 0) sb.append('(');
                count++;
            }

            if (ch == ')') {
                count--;
                if (count != 0) sb.append(')');
            }
        }
        return sb.toString();
    }
}