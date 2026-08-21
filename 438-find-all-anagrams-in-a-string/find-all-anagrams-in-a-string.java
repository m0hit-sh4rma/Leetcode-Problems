class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        int n = arr.length;
        p = new String(arr);

        for (int i = 0; i < s.length() - n + 1; i++) {
            String sub = s.substring(i, i + n);
            char[] chars = sub.toCharArray();
            Arrays.sort(chars);
            sub = new String(chars);

            if (p.equals(sub)) list.add(i);
        }
        return list;
    }
}