class Solution {
    public String addSpaces(String s, int[] spaces) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (int num : spaces) {
            sb.append(s.substring(i, num) + " ");
            i = num;
        }
        sb.append(s.substring(i,s.length()));
        return sb.toString();
    }
}