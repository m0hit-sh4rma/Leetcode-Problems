class Solution {
    public long removeZeros(long n) {
        String s = Long.toString(n);
        long ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch - '0' != 0) ans = ans * 10 + (ch - '0');
        }
        return ans;
    }
}