// Not understand, need watch youtub video later
//Solution I
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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getH(root.left) - getH(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    private int getH(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftH = getH(root.left);
        int rightH = getH(root.right);
        return Math.max(leftH, rightH) + 1;
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
    public boolean isBalanced(TreeNode root) {
        
        return getH(root) != -1;
    }
   
    private int getH(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = getH(root.left);
        if (leftH == -1) {
            return -1;
        }
        
        int rightH = getH(root.right);
        if (rightH == -1) {
            return -1;
        }
        
        if (Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        
        return Math.max(leftH, rightH) + 1;
    
        
    }
    
    
}