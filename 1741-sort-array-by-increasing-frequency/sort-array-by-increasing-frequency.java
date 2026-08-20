class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (map.get(a) == map.get(b)) return Integer.compare(b, a);
                return Integer.compare(map.get(a), map.get(b));
            }
        });
        pq.addAll(map.keySet());

        int idx = 0;
        while (!pq.isEmpty()) {
            int x = pq.poll();
            int n = map.get(x);
            for (int i = 0; i < n; i++) {
                nums[idx++] = x;
            }
        }
        return nums;
    }
}