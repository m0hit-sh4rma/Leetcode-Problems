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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) return head;
        ListNode current = head;
        ListNode next = head.next;

        while (next != null) {
            int gcd = gcd(current.val, next.val);
            current.next = new ListNode(gcd);
            current.next.next = next;
            current = next;
            next = current.next;
        }
        return head;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}