class Solution {
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return new ArrayList<>();
        List<String> ans = new ArrayList<>();

        restore (s, 0, ans, new ArrayList<>());

        return ans;
    }

    private void restore (String s, int index, List<String> ans, List<String> list) {
        if (list.size() == 4 && index == s.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i < list.size() - 1) sb.append(".");
            }
            ans.add(new String(sb));
            return;
        }
        for (int i = index; i < Math.min(s.length(), index + 3); i++) {
            String sub = s.substring(index, i + 1);

            if (valid(sub)) {
                list.add(sub);
                restore(s, i + 1, ans, list);
                list.removeLast();
            }
        }
    }

    private boolean valid(String sub) {
        if (sub.length() > 1 && sub.charAt(0) == '0') return false;
        return Integer.parseInt(sub) <= 255;
    }
}