class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] frq = new int[26];

        for (char ch : text.toCharArray()) frq[ch - 'a']++;

        int count = text.length();

        count = Math.min(count, frq['b' - 'a']);
        count = Math.min(count, frq['a' - 'a']);
        count = Math.min(count, frq['l' - 'a'] / 2);
        count = Math.min(count, frq['o' - 'a'] / 2);
        count = Math.min(count, frq['n' - 'a']);

        return count;
    }
}