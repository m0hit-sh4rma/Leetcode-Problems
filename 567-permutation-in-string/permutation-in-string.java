class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int j = s1.length();

        while (j <= s2.length()) {
            if (isSame(s1, s2.substring(i, j))) return true;
            i++;
            j++;
        }
        return false;
    }
    private boolean isSame(String s, String t) {
        int[] frq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
            frq[t.charAt(i) - 'a']--;
        }

        for (int count : frq) if (count != 0) return false;
        return true;
    }
}