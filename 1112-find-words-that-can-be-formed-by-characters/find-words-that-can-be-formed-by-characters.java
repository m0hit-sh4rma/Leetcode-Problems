class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;

        for (String word : words) {
            int[] frq = new int[26];
            for (char ch : chars.toCharArray()) frq[ch - 'a']++;
            boolean done = true;

            for (char ch : word.toCharArray()) {
                if (frq[ch - 'a'] == 0) {
                    done = false;
                    break;
                }
                frq[ch - 'a']--;
            }
            if (done) count += word.length();
        }
        return count;
    }
}