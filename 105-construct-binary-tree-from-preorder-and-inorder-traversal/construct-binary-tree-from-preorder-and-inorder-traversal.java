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
 *         this.right = right;https://assets.leetcode.com/uploads/2021/02/19/tree.jpg$0
 *     }
 * }
 */
class Solution {
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }    

        return build(preorder, 0, inorder.length - 1, map);    
    }
    private TreeNode build (int[] preOrder, int left, int right, HashMap<Integer, Integer> map) {
        if (left > right) return null;

        int current = preOrder[index++];
        TreeNode node = new TreeNode(current);

        int currentIndex = map.get(current);

        node.left = build(preOrder, left, currentIndex - 1, map);
        node.right = build(preOrder, currentIndex + 1, right, map);

        return node;
    }
}