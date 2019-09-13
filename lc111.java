/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 /**DFS*/
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        if (left == 0) {
            return right + 1;
        }
        
        if (right == 0) {
            return left + 1;
        }
        return Math.min(left, right) + 1;
    }
    
    
}

// BFS outperforms DFS on highly unbalanced trees since it terminates once it reaches the first leaf node.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Queue.offer() is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.

/***BFS****/
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        int level = 0;
        while (!q.isEmpty()) {
            level++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();// remove and return the head of queue
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
                if (curr.left == null && curr.right == null) {
                    return level;
                }
            }
        }
        return level;
    }
    
    
}