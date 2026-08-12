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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};
        List<Integer> nodes = new ArrayList<>();

        ListNode prev = head;
        ListNode temp = head.next;
        int idx = 2;

        while (temp.next != null) {
            if ((temp.val > prev.val && temp.val > temp.next.val) || (temp.val < prev.val && temp.val < temp.next.val)){
                nodes.add(idx);
            }

            prev = temp;
            temp = temp.next;
            idx++;
        }

        int n = nodes.size();

        if (n <= 1) return ans;
        else {
            ans[0] = nodes.get(n - 1) - nodes.get(n - 2);
            int i = n - 1;
            while (i > 0) {
                int dis = nodes.get(i) - nodes.get(i - 1);
                i--;
                ans[0] = Math.min(ans[0], dis);
            }
            ans[1] = nodes.get(n - 1) - nodes.get(0);
        }

        return ans;
    }
}