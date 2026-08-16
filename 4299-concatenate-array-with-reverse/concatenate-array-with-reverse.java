class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < result.length; i++) {
            if (i >= n) {
                result[i] = nums[--n];
            }
            else{
                result[i] = nums[i];
            }
        }
        return result;
    }
}