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
    public TreeNode bstFromPreorder(int[] preorder) {
      return tree(preorder, 0, preorder.length - 1);
    }
    
    public TreeNode tree(int[] preorder, int from, int to) {
        if (from > to) return null;
        TreeNode root = new TreeNode(preorder[from]);
        boolean found = false;
        for(int i = from + 1; i <= to; i++) {
            if(preorder[i] > preorder[from]) {
                root.left = tree(preorder, from+1, i-1);
                root.right = tree(preorder, i, to);
                found = true;
                break;
            }
        }
        if(!found) {
            root.left = tree(preorder, from+1, to);
        }
        return root;
    }
}