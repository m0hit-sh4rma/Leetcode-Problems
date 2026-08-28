class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) list.add(ch);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        int k = 0;

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) sb.append(list.get(k++));
            else sb.append(ch);
        }
        return sb.toString();
    }
    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        return false;
    }
}