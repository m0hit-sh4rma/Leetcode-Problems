class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i + 3 <= nums.length) {
                    for (int j = i; j < i + 3; j++) {
                        if (nums[j] == 0) nums[j] = 1;
                        else nums[j] = 0;
                    }
                    operations++;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return -1;
        }
        return operations;
    }
}