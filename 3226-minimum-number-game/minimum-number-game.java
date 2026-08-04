class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }

        int i = 0;
        while (!pq.isEmpty()) {
            int alice = pq.poll();
            int bob = pq.poll();

            nums[i++] = bob;
            nums[i++] = alice;
        }
        return nums;
    }
}