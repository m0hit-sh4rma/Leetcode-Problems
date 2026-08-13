class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate(n, 0, 0, new StringBuilder(), ans);

        return ans;
    }
    private void generate(int n, int left, int right, StringBuilder sb, List<String> ans) {
        if (sb.length() == 2 * n) {
            ans.add(sb.toString());
            return;
        }

        if (left < n) {
            sb.append('(');
            generate(n, left + 1, right, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right< left) {
            sb.append(')');
            generate(n, left, right + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}