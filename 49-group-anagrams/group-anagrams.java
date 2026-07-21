class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] str = word.toCharArray();
            Arrays.sort(str);
            String sortedWord = new String(str);

            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}