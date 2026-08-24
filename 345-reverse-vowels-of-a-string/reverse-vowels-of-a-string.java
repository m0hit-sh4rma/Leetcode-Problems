class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            else if (isVowel(chars[i]) && !isVowel(chars[j])) j--;
            else if (!isVowel(chars[i]) && isVowel(chars[j])) i++;
            else {
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        return false;
    }
}