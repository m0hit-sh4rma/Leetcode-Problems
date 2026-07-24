class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] frq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
        }

        int occurance = 0;

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] == 0) continue;
            if (occurance == 0) {
                occurance = frq[i];
            }

            if (occurance != frq[i]) return false;
        }
        return true;
    }
}