class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frq = new int[26];

        for (char ch : ransomNote.toCharArray()) {
            frq[ch - 'a']++;
        }

        for (char ch : magazine.toCharArray()) {
            frq[ch - 'a']--;
        }

        for (int count : frq) if (count > 0) return false;
        return true;
    }
}