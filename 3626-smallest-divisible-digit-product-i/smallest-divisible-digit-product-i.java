class Solution {
    public int smallestNumber(int n, int t) {
        int product = 1;

        while (product % t != 0) {
            int temp = n;
            while (temp != 0) {
                product *= temp % 10;
                temp /= 10;
            }
            if (product % t != 0) {
                n++;
                product = 1;
            }
        }
        return n;
    }
}