class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans[i] = Math.max(ans[i], arr[j]);
            }
        }
        return ans;
    }
}