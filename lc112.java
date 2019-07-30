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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        
        return pathCore(root, sum);
    }
    
    private boolean pathCore(TreeNode root, int sum) {
        if (root != null) {
            if (sum - root.val == 0 && root.left == null && root.right == null)
                return true;
            return pathCore(root.left, sum - root.val) || pathCore(root.right, sum - root.val);
        }
        return false;
    }
    
}