class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int i = 0;
        int j = k - 1;

        while (j < arr.length - 1) {
            if (sum / k >= threshold) count++;

            sum -= arr[i++];
            sum += arr[++j];
        }
        if (sum / k >= threshold) count++;

        return count;
    }
}