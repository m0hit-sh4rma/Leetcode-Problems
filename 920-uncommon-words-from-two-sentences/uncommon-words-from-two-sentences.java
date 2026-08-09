class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s : word1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : word2) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        String[] ans = new String[list.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}