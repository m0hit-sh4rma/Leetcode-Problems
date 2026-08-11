class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        partitions(s, 0, new ArrayList<>(), ans);

        return ans;
    }
    private void partitions(String s, int index, List<String> list, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int end = index; end < s.length(); end++) {
            String sub = s.substring(index, end + 1);

            if (palindrome(sub)) {
                list.add(sub);
                partitions(s, end + 1, list, ans);
                list.removeLast();
            }
        }
    }

    private boolean palindrome (String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}