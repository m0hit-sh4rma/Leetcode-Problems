class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) count++; 
        }

        int curr = count;
        int i = 0;
        int j = k - 1;

        while (j < s.length() - 1) {
            count = Math.max(curr, count);

            if (isVowel(s.charAt(i++))) curr--;
            if (isVowel(s.charAt(++j))) curr++;
        }
        count = Math.max(curr, count);
        return count;        
    }
    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}