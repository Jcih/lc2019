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
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            invert(root);
        }
    
        return root;
    }
    
    public void invert(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            
            invert(root.left);
            invert(root.right);
        }
    }
}