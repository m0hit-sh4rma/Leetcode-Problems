class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        int i = 1;
        for (char ch : s.toCharArray()) {
            int rev = 26 - (ch - 'a');
            degree += (rev * i);
            i++;
        }
        return degree;
    }
}