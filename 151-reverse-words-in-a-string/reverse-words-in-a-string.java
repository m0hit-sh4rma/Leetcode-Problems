class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        s = s.trim();
        
        int i = 0;
        int j = 0;
        
        while (j < s.length()) {
            while (j < s.length() && s.charAt(j) == ' ') {
                j++;
            }
            i = j;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            list.add(s.substring(i, j));
        }
        
        StringBuilder sb = new StringBuilder();
        int k = list.size() - 1;
        while (k > 0) sb.append(list.get(k--) + " ");
        sb.append(list.get(k));
        
        return sb.toString();
    }
}