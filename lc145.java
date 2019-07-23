

//Solution I: faster than 62.77%
/**
     * A tricky one: Modify the code for pre-order traversal
     * so that it becomes root->right->left,
     * and then reverse the result to get left->right->root.
     */
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root ==  null) return res;
        
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            res.add(curr.val);
            
            if (curr.left != null) {
                stack.push(curr.left);
            }
            
            if (curr.right != null)
                stack.push(curr.right);
        }
        
        Collections.reverse(res);
        return res;
    }
}


//Solution II 100%

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        return post(root, res);
    }
    
    public List<Integer> post(TreeNode root, List<Integer> res) {
        if (root == null) {
            return res;
        }
        post(root.left, res);
        post(root.right, res);
        res.add(root.val);
        return res;
    }
}