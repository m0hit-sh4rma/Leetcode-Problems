class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] sFrq = new int[26];
        int[] tFrq = new int[26];

        for (char ch : s.toCharArray()) sFrq[ch - 'a']++;
        for (char ch : target.toCharArray()) tFrq[ch - 'a']++;

        int count = s.length();

        for (int i = 0; i < tFrq.length; i++) {
            if (tFrq[i] > 0) count = Math.min(count, sFrq[i] / tFrq[i]);
        }
        return count;
    }
}