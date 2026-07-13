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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<>() {
            public int compare(ListNode a, ListNode b){
                return Integer.compare(a.val, b.val);
            }
        });

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) pq.offer(lists[i]);
        }

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();

            if (node.next != null) pq.offer(node.next);

            tail.next = node;
            tail = tail.next;
        }

        return dummy.next;
    }
}