/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();

        pQueue.add(p);
        qQueue.add(q);

        while (!pQueue.isEmpty() && !qQueue.isEmpty()) {
            TreeNode currentP = pQueue.poll();
            TreeNode currentQ = qQueue.poll();

            if (currentP.val != currentQ.val) return false;

            if (currentP.left != null && currentQ.left != null) {
                pQueue.add(currentP.left);
                qQueue.add(currentQ.left);
            }
            else if ((currentP.left != null || currentQ.left != null)) {
                return false;
            }

            if (currentP.right != null && currentQ.right != null) {
                pQueue.add(currentP.right);
                qQueue.add(currentQ.right);
            }
            else if ((currentP.right != null || currentQ.right != null)) {
                return false;
            }
        }
        return true;
    }
}