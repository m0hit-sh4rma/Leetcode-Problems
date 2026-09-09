class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = p.length();

        while (j <= s.length()) {
            if (isAnagram(s.substring(i, j), p)) list.add(i);
            i++;
            j++;
        }
        return list;
    }
    private boolean isAnagram(String s, String t) {
        int[] frq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
            frq[t.charAt(i) - 'a']--;
        }

        for (int count : frq) if (count != 0) return false;
        return true;
    }
}