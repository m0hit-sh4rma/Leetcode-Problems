class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int dis = 0;

        for (int num : nums) {
            dis += num;
            if (dis == 0) count++;
        }
        return count;
    }
}