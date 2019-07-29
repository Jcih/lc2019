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
    
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        String s = "";
        
        dfs(root, s, result);
        
        return result;
    }
    
    public void dfs(TreeNode node, String s, List<String> result) {
        s += node.val;
        if (node.left == null && node.right == null) {
            result.add(s);
        }
        if (node.left != null) {
            dfs(node.left, s + "->", result);
        }
        if (node.right != null) {
            dfs(node.right, s + "->", result);
        }
    }
}