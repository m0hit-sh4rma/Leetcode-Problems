class Solution {
    public int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        int prefXOR = 0;

        for (int i = 0; i < pref.length; i++) {
            ans[i] = prefXOR ^ pref[i];
            prefXOR ^= ans[i];
        }
        return ans;
    }
}