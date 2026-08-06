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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1, head);

        ListNode prev = dummy;
        ListNode current = head;
        ListNode next = current.next;

        while (next != null) {
            if (current.val == next.val) {
                while (next != null && current.val == next.val) {
                    next = next.next;
                }
                current = prev;
                current.next = next;
                current = current.next;
                if (current != null) next = current.next;
            }
            else {
                prev = current;
                current = current.next;
                if (current != null) next = current.next;
            }
        }

        return dummy.next;
    }
}