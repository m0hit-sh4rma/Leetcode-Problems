class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int n = searchWord.length();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= n && words[i].substring(0, n).equals(searchWord)) return i + 1;
        }
        return -1;
    }
}