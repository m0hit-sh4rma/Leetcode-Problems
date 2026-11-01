class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                if (s.charAt(i) >= 65 && s.charAt(i) <= 90 && s.charAt(i) != (char)(s.charAt(i - 1) - 32)) count++;

                else if (s.charAt(i) >= 97 && s.charAt(i) <= 122 && s.charAt(i) != (char)(s.charAt(i - 1) + 32)) count++;
            }
        }
        return count;
    }
}