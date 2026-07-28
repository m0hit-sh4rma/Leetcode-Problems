class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            int currentValue = value(s.charAt(i));

            if (i == n - 1) ans += currentValue;
            else if (currentValue < value(s.charAt(i + 1))) ans -= currentValue;
            else ans += currentValue;
        }
        return ans;
    }
    private int value(char ch) {
        switch (ch) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
}