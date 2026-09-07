class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            if (!isRepeating(s.substring(i, i + 3))) count++;
        }
        return count;
    }
    private boolean isRepeating(String s) {
        boolean[] frq = new boolean[26];

        for (char ch : s.toCharArray()) {
            if (frq[ch - 'a']) return true;
            frq[ch - 'a'] = true;
        }
        return false;
    }
}