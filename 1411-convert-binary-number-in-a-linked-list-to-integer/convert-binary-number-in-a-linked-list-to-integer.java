/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;

        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        String s = sb.toString();
        int ex = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int binary = s.charAt(i) - '0';

            result += binary * (int)Math.pow(2, ex++);
        }
        return result;
    }
}