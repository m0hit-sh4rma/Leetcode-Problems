class Solution {
    public char repeatedCharacter(String s) {
        boolean[] existed = new boolean[26];

        for (char ch : s.toCharArray()) {
            if (existed[ch - 'a']) return ch;
            existed[ch - 'a'] = true;
        }
        return ' ';
    }
}