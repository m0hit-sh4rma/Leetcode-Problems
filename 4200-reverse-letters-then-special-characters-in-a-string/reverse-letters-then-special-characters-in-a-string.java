class Solution {
    public String reverseByType(String s) {
        int n = s.length();
        if (n == 1) return s;
        boolean[] isChar = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) isChar[i] = true;
        }

        char[] ch = s.toCharArray();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (i < n && !isChar[i]) i++;
            while (j >= 0 && !isChar[j]) j--;

            if (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }

        i = 0;
        j = n - 1;
        while (i < j) {
            while (i < n && isChar[i]) i++;
            while (j >= 0 && isChar[j]) j--;

            if (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}