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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null) return head;
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        ListNode start = head;
        ListNode end = head;
        ListNode next = end.next;

        for (int i = 1; i < right; i++) {
            if (i < left) {
                prev = prev.next;
                start = start.next;
            }
            end = end.next;
            next = next.next;
        }
        prev.next = null;
        end.next = null;

        start = reverse(start);

        prev.next = start;

        while (prev.next != null) {
            prev = prev.next;
        }
        prev.next = next;

        return dummy.next;
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}