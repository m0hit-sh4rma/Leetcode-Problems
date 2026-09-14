class Solution {
    public int countAsterisks(String s) {
        int barCount = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '|') barCount++;
            if (barCount % 2 == 0 && ch == '*') count++;
        }
        return count;
    }
}