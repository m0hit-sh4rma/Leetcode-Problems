class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);
        int curr1 = nums[0];
        int curr2 = nums[1];

        for (int i = 2; i < nums.length; i++) {
            if (curr1 > curr2) {
                list1.add(nums[i]);
                curr1 = nums[i];
            }
            else{
                list2.add(nums[i]);
                curr2 = nums[i];
            }
        }

        int idx = 0;
        for (int i = 0; i < list1.size(); i++) {
            nums[idx++] = list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            nums[idx++] = list2.get(i);
        }
        return nums;
    }
}