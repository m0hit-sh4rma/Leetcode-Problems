class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int count = 0;
        for (List<Integer> list : map.values()) {
            int n = list.size();
            if (n >= 3) {
                boolean flag = true;
                for (int i = 0; i <= n - 3; i++) {
                    if ((list.get(i + 1) - list.get(i)) != (list.get(i + 2) -list.get(i + 1))) {
                        flag = false;
                    }
                }
                if (flag) count++;
            }
        }
        return count;
    }
}