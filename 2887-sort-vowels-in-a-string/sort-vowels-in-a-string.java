class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> a - b);

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                pq.offer(chars[i]);
                chars[i] = '-';
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-') chars[i] = pq.poll();
        }
        return new String(chars);
    }
}