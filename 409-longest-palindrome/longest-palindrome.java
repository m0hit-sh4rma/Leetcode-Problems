class Solution {
    public int longestPalindrome(String s) {
        int[] frq = new int[128];

        for (char ch : s.toCharArray()) frq[ch]++;

        int length = 0;
        boolean oddEntry = false;

        for (int n : frq) {
            if (n % 2 == 0) length += n;
            else {
                length += (n - 1);
                oddEntry = true;
            }
        }
        return oddEntry ? length + 1 : length;
    }
}