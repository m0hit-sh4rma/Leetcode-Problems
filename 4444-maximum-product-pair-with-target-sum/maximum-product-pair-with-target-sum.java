class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] ans = {-1, -1};
        int product = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target && nums[i] > nums[j] && nums[i] * nums[j] > product) {
                    product = nums[i] * nums[j];
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}