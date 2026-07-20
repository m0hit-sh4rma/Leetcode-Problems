class Solution {
    public String kthLargestNumber(String[] nums, int k) {
       PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String num1, String num2) {
                if (num1.length() != num2.length()) {
                    return Integer.compare(num1.length(), num2.length());
                }
                return num1.compareTo(num2);
            }
        });

        for (String num : nums) {
            pq.offer(num);

            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}