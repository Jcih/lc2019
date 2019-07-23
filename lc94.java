//Solution I, recursive
//Inorder: left root right
//preorder: root left right
//postorder: left right root

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    
    public List<Integer> inorder(TreeNode root, List<Integer> res) {
        if (root == null)
            return res;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
        
        return res;
    }
}




//SolutionII iteration
//https://blog.csdn.net/u013564276/article/details/51232927
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        
        return res;
    }
    
   
}