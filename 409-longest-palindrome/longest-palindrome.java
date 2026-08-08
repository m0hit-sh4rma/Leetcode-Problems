class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int length = 0;
        boolean oddEntry = false;

        for (int value : map.values()) {
            if (value % 2 == 0) length += value;
            else if (!oddEntry && value % 2 != 0) length += value;
            else if (oddEntry && value % 2 != 0) {
                value = value - (value % 2);
                length += value;
            }
            if (value % 2 != 0) oddEntry = true;
        }
        return length;
    }
}