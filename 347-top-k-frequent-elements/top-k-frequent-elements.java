class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> frequentElements = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(map.get(a), map.get(b));
            }
        });

        for (var entry : map.entrySet()) {
            if (frequentElements.size() < k) {
                frequentElements.offer(entry.getKey());
            }
            else {
                int frq = map.get(frequentElements.peek());
                if (entry.getValue() > frq) {
                    frequentElements.poll();
                    frequentElements.offer(entry.getKey());
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = frequentElements.poll();
        }
        return result;
    }
}