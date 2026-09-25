class Solution {
    public int maxDistinct(String s) {
        boolean[] isPresent = new boolean[26];

        for (char ch : s.toCharArray()) isPresent[ch - 'a'] = true;

        int count = 0;
        for (boolean val : isPresent) if (val) count++;

        return count;
    }
}