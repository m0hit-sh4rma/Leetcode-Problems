class Solution {
    public int repeatedNTimes(int[] nums) {
        int[] frq = new int[10001];
        int n = nums.length / 2;
        int ans = 0;

        for (int num : nums) {
            frq[num]++;
            if (frq[num] == n) ans = num;
        }
        return ans;
    }
}