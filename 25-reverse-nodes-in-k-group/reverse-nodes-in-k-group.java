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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null) return head;
        ListNode dummy = new ListNode(-1, head);

        ListNode prev = dummy;
        ListNode start = head;
        ListNode end = head;
        ListNode next = head.next;

        while (end != null) {
            int i = 1;
            while (end.next != null && i < k) {
                end = next;
                if (end != null) next = next.next;
                i++;
            }
            if (i == k) {
                prev.next = null;
                if (end != null) end.next = null;
                start = reverse(start);

                end = start;
                while(end.next != null) {
                    end = end.next;
                }
                prev.next = start;
                end.next = next;
            }
            else break;

            prev = end;
            start = next;
            end = next;
            if (end != null) next = end.next;
        }
        return dummy.next;
    }
    private ListNode reverse(ListNode current) {
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