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
    int res = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        dfs(root, L, R);
        return res;
    }
    
    public void dfs(TreeNode root, int L, int R) {
        if (root == null) return;
        
        if (L <= root.val && root.val <= R) 
            res += root.val;
        if (L < root.val) {
            dfs(root.left, L, R);
        }
        if (root.val < R) {
            dfs(root.right, L, R);
        }
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
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        
        int res = 0;
        if (L <= root.val && root.val <= R) {
            res += root.val;
        }
        if (L < root.val) {
            res += rangeSumBST(root.left, L, R);
        }
        if (root.val < R) {
            res += rangeSumBST(root.right, L, R);
        }
        
        return res;
    }
    
}