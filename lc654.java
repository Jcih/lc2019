/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Solution I
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }
    
    public TreeNode construct(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        
        if (l == r) {
            return new TreeNode(nums[l]);
        }
        int ma_idx = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] > nums[ma_idx]) {
                ma_idx = i;
            }
        }
        TreeNode root = new TreeNode(nums[ma_idx]);
        root.left = construct(nums, l, ma_idx - 1);
        root.right = construct(nums, ma_idx + 1, r);
        return root;
    }
    
}



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//Solution II: use recursion
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {return new TreeNode(val);}
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        
        return root;
    }
}