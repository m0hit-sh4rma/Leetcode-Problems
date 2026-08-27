class Solution {
    public String reverseStr (String s, int k) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = k - 1;

        while (end < chars.length) {
            reverse(chars, start, end);
            start = end + k + 1;
            end = start + k - 1;
        }
        if (start < chars.length) {
            end = chars.length - 1;

            if (start - end + 1 <= k) {
                reverse(chars, start, end);
            }
            else {
                reverse(chars, start, start + k - 1);
            }
        }
        return new String(chars);
    }

    private void reverse(char[] arr, int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}