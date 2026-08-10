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
        ListNode start = head;

        for (int i = 1; i < k; i++) {
            start = start.next;
        }

        ListNode end = head;
        ListNode temp = head;

        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        while (temp != null) {
            temp = temp.next;
            end = end.next;
        }

        int val = start.val;
        start.val = end.val;
        end.val = val;

        return head;
    }
}