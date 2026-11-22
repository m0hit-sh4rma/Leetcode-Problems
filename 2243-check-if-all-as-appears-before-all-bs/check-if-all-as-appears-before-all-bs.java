class Solution {
    public boolean checkString(String s) {
        boolean appearedB = false;

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'b') appearedB = true;

            if(ch == 'a' && appearedB) return false;
        }
        return true;
    }
}