class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = 0;
        int current = requests[0];
        time += current;

        for (int i = 0; i < requests.length; i++) {
            time += Math.abs(requests[i] - current);
            current = requests[i];
        }
        return time;
    }
}