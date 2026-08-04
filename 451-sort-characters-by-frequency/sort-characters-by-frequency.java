class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return Integer.compare(map.get(c2), map.get(c1));
            }
        });
        
        pq.addAll(map.keySet());
        
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();

            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}