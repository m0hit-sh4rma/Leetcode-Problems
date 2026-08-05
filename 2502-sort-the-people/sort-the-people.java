class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        Map<Integer, String> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(map);

        int i = 0;
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            names[i++] = entry.getValue();
        }
        return names;
    }
}