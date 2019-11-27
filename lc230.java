/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);
        return inorderList.get(k - 1);
    }
    
    private void inorder(TreeNode root, List<Integer> inorderList) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorder(root.left, inorderList);
        }
        inorderList.add(root.val);
        if (root.right != null) {
            inorder(root.right, inorderList);
        }
        return;
    }
}