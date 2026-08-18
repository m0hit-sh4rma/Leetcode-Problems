class Solution {
    public int countValidPrefixes(String s) {
        int i = 0;
        int count = 0;

        int count0 = 0;
        int count1 = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '0') count0++;
            else count1++;

            if (Math.abs(count0 - count1) <= 1) count++;
            i++;
        }
        return count;
    }
}