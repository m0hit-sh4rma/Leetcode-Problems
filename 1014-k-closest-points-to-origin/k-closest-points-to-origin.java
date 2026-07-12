class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(
                        (b[0] * b[0] + b[1] * b[1]),
                        (a[0] * a[0] + a[1] * a[1])
                );
            }
        });

        for (int[] point : points) {
            if (pq.size() < k) {
                pq.offer(point);
            } else {
                int[] top = pq.peek();

                if ((top[0] * top[0] + top[1] * top[1]) > (point[0] * point[0] + point[1] * point[1])) {
                    pq.poll();
                    pq.offer(point);
                }
            }
        }

        int[][] ans = new int[k][];

        while (!pq.isEmpty()) {
            ans[--k] = pq.poll();
        }

        return ans;
    }
}