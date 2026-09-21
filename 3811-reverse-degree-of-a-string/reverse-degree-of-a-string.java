class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        int i = 1;
        for (char ch : s.toCharArray()) {
            degree += ((26 - (ch - 'a')) * (i++));
        }
        return degree;
    }
}