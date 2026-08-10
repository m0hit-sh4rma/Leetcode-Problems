class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        double avg = Integer.MAX_VALUE;

        while (i < j) {
            avg = Math.min(avg, (double)(nums[i++] + nums[j--]) / 2);
        }
        return avg;
    }
}