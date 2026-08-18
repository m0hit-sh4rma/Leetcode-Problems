class Solution {
    public int longestContinuousSubstring(String s) {
        int n = s.length();
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                maxLength = Math.max(maxLength, currentLength);
                break;
            }
            if (s.charAt(i) - 1 == s.charAt(i - 1)) {
                currentLength++;
            }
            else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return maxLength;
    }
}