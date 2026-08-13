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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if (head.next == null || head.next.next == null) return head;

        ListNode prev = head;
        ListNode start = head.next;
        ListNode end = start;
        ListNode next = end.next;
        int count = 1;

        while (end != null) {
            int i = 1;
            while (i != count + 1) {
                if (next == null) break;
                end = next;
                next = next.next;
                i++;
            }
            if (i % 2 == 0) {
                prev.next = null;
                end.next = null;

                start = reverse(start);

                prev.next = start;

                while (prev.next != null) {
                    prev = prev.next;
                }
                prev.next = next;
                start = next;
                end = start;
                if (end != null) next = end.next;
            }
            else {
                prev = end;
                start = end.next;
                end = start;
                if (end != null) next = end.next;
            }
            count = i;
        }

        return head;
    }
    private ListNode reverse (ListNode current) {
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}