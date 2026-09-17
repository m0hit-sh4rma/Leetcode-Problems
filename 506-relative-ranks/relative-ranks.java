class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for(int i =0;i < score.length;i++) {
            pq.offer(new int[] {score[i],i});
        }
        int k = 1;
        String[] ans = new String[score.length];
        while(!pq.isEmpty()) {
            if(k == 1) ans[pq.poll()[1]] = "Gold Medal";
            else if(k == 2) ans[pq.poll()[1]] = "Silver Medal";
            else if(k == 3) ans[pq.poll()[1]] = "Bronze Medal";
            else ans[pq.poll()[1]] = Integer.toString(k);
            k++;
        }
        return ans;
    }
}