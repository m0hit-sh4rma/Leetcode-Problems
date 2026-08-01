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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode lastEven = head;

        while (lastEven.next != null && lastEven.next.next != null) {
            lastEven = lastEven.next.next;
        }

        ListNode afterEven = lastEven.next;
        ListNode temp = head;
        ListNode tempNode = lastEven;

        while (temp != lastEven) {
            ListNode odd = temp.next;
            temp.next = temp.next.next;
            temp = temp.next;

            tempNode.next = odd;
            tempNode = tempNode.next;
            tempNode.next = afterEven;
        }
        return head;
    }
}