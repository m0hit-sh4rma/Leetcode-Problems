class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        int j = 0;

        while (j < nums.length && sum < target) sum += nums[j++];
        j--;

        while (i < nums.length && j < nums.length) {
            int len = j - i + 1;
            if (sum >= target) minLen = Math.min(minLen, len);

            sum -= nums[i];
            i++;
            j++;

            while (j < nums.length && sum < target) {
                sum += nums[j++];
            }
            j--;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}