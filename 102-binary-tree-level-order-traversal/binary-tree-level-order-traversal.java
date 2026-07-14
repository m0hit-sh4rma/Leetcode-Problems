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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        traverse (root, list);
        
        return list;
    }

    public void traverse (TreeNode root, List<List<Integer>> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> nodeList = new ArrayList<>();
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode current = queue.poll();
                nodeList.add(current.val);
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            list.add(new ArrayList<>(nodeList));
        }
    }
}