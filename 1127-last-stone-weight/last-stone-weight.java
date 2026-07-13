class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int weight : stones) {
            pq.offer(weight);
        }

        while (pq.size() > 1) {
            int afterSmash = pq.poll() - pq.poll();

            if (afterSmash != 0) pq.offer(afterSmash);
        }
        return (pq.isEmpty()) ? 0 : pq.poll();
    }
}