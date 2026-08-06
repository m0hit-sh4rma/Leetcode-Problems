class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] present = new boolean[26];

        for (int i = 0; i < allowed.length(); i++) {
            present[allowed.charAt(i) - 'a'] = true;
        }

        int count = 0;

        for (String s : words) {
            boolean valid = true;
            for (int i = 0; i < s.length(); i++) {
                if (!present[s.charAt(i) - 'a']) {
                    valid = false;
                    break;
                }
            }
            if (valid) count++;
        }
        return count;
    }
}