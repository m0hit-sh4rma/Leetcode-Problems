class Solution {
    public int titleToNumber(String columnTitle) {
        int pow = 0;
        int i = columnTitle.length() - 1;
        int number = 0;

        while (i >= 0) {
            int ch = columnTitle.charAt(i--) - 'A' + 1;

            number += (ch * Math.pow(26, pow++));
        }
        return number;
    }
}