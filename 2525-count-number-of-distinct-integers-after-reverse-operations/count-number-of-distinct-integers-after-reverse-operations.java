class Solution {
    public int countDistinctIntegers(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int n = 0;
            while (num != 0) {
                n = n * 10 + num % 10;
                num /= 10;
            }
            arr[i] = n;
        }

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            set.add(arr[i]);
        }
        return set.size();
    }
}