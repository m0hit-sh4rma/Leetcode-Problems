class Solution {
    public int findClosestNumber(int[] nums) {
        int[] ans = {nums[0], Math.abs(nums[0] - 0)};

        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - 0);
            if ((diff < ans[1]) || (diff == ans[1] && nums[i] > ans[0])) {
                ans[0] = nums[i];
                ans[1] = diff;
            }
        }
        return ans[0];
    }
}