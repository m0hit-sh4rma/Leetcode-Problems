class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        long sum = 0;

        Arrays.fill(ans, -1);
        if (2 * k >= n) return ans;

        for (int i = 0; i < 2 * k + 1; i++) sum += nums[i];
        ans[k] = (int)(sum / (2 * k + 1));

        int i = 0;
        int curr = k + 1;
        int j = 2 * k + 1;

        while (j < n) {
            sum += (nums[j++] - nums[i++]);
            ans[curr++] = (int)(sum / (2 * k + 1));
        }
        return ans;
    }
}