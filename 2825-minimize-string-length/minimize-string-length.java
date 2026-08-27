class Solution {
    public int minimizedStringLength(String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] existed = new boolean[26];

        for (char ch : s.toCharArray()) {
            if (!existed[ch - 'a']) {
                sb.append(ch);
                existed[ch - 'a'] = true;
            }
        }
        return sb.length();
    }
}