class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] isBroken = new boolean[26];

        for (char ch : brokenLetters.toCharArray()){
            isBroken[ch - 'a'] = true;
        }

        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean canType = true;
            for (char ch : word.toCharArray()) {
                if (isBroken[ch - 'a']) {
                    canType = false;
                }
            }
            if (canType) count++;
        }
        return count;
    }
}