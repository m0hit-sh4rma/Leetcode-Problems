class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] rank = new String[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (score[j] > score[i]) count++;
            }
            if (count == 1) rank[i] = "Gold Medal";
            else if (count == 2) rank[i] = "Silver Medal";
            else if (count == 3) rank[i] = "Bronze Medal";
            else rank[i] = Integer.toString(count);
        }
        return rank;
    }
}