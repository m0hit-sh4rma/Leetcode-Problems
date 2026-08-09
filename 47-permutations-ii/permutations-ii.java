class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        find(nums, used,new ArrayList<>(), ans);
        return ans;
    }
    private void find(int[] nums, boolean[] used,List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int idx = 0; idx < nums.length; idx++) {
            if (!used[idx]) {
                if (idx > 0 && nums[idx] == nums[idx - 1] && !used[idx - 1]) continue;
                used[idx] = true;
                list.add(nums[idx]);
                find(nums, used,list, ans);
                list.removeLast();
                used[idx] = false;
            } 
        }
    }
}