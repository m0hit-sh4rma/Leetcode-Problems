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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int size = size(head);
        ListNode temp = head;

        for (int i = 0; i < k; i++) {
            if (size <= k) {
                if (temp != null) {
                    ans[i] = temp;
                    ListNode next = temp.next;
                    temp.next = null;
                    temp = next;
                }
            }
            else {
                ans[i] = temp;
                int max = size / k;
                int extra = size % k;
                while (--max != 0) {
                    temp = temp.next;
                }
                if (i < extra) temp = temp.next;
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }
        return ans;
    }
    private int size(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}