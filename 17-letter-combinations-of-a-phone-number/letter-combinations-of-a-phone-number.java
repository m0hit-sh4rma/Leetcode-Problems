class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        find(digits, 0, new StringBuilder(), ans);
        return ans;
    }

    private void find(String digits, int index, StringBuilder sb, List<String> ans) {
        if (sb.length() == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        if (index == digits.length()) return;

        String str = letters(digits.charAt(index));

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            find(digits, index + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    private String letters(char ch) {
        switch (ch) {
            case '2' : return "abc";
            case '3' : return "def";
            case '4' : return "ghi";
            case '5' : return "jkl";
            case '6' : return "mno";
            case '7' : return "pqrs";
            case '8' : return "tuv";
            case '9' : return "wxyz";
        }
        return "";
    }
}