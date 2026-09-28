class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') count++;
            if (ch == ')') count--;

            depth = Math.max(depth, count);
        }
        return depth;
    }
}