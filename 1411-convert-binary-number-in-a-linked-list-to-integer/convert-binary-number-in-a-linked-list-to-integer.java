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
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int pow = 1;
        int result = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) != 0) result += pow;
            pow *= 2;
        }
        return result;
    }
}