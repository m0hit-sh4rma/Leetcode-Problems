class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0;
        boolean[] visited = new boolean[100];
        int idx1 = -1;
        int idx2 = -1;

        for (int i = 0; i < nums.length; i++) {
            int frq = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (!visited[nums[i] - 1]) {
                    if (frq == 1 && nums[i] == nums[j]) {
                        frq++;
                        idx1 = j;
                    }
                    else if (frq == 2 && nums[i] == nums[j]) {
                        frq++;
                        idx2 = j;
                    }
                    else if (frq > 2 && nums[i] == nums[j]) {
                        frq++;
                        break;
                    }
                }
            }
            if (frq == 3 && (idx1 - i) == (idx2 - idx1)) {
                count++;
            }
            visited[nums[i] - 1] = true;
        }
        return count;
    }
}