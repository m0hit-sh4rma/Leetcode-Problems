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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(-1, head);
        ListNode startPrev = dummy;
        ListNode start = head;

        for (int i = 1; i < k; i++) {
            startPrev = startPrev.next;
            start = start.next;
        }

        ListNode endPrev = dummy;
        ListNode end = head;
        ListNode temp = head;

        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        while (temp != null) {
            temp = temp.next;
            end = end.next;
            endPrev = endPrev.next;
        }

        startPrev.next = end;
        endPrev.next = start;
        ListNode next = start.next;
        start.next = end.next;
        end.next = next;

        return dummy.next;
    }
}