class Solution {
    public boolean divideArray(int[] nums) {
        int[] frq = new int[501];

        for (int num : nums) frq[num]++;

        for (int freq : frq) {
            if (freq % 2 != 0) return false;
        }

        return true;
    }
}