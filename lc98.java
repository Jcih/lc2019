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
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return helper(root, null, null);
    }
    public boolean helper(TreeNode root, Integer max, Integer min) {
        if (root == null) return true;
        if ((max != null && root.val >= max) || (min != null && root.val <= min)) return false;
        Boolean left = helper(root.left, root.val, min);
        Boolean right = helper(root.right, max, root.val);
        return left && right;
    }
}


//Solution II
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
    public boolean isValidBST(TreeNode root) {
        if (root== null || (root.left == null && root.right == null)) {
            return true;
        }
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValidBST(TreeNode root, long low, long high) {
        if (root == null) {
            return true;
        }
        
        boolean isLeftBST = isValidBST(root.left, low, root.val);
        boolean isRightBST = isValidBST(root.right, root.val, high);
        
        boolean isBST = (long)root.val > low && root.val < high;
            
        
        return isLeftBST && isRightBST && isBST;
    }
}