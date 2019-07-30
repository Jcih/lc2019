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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        List<Integer> curr = new ArrayList<>();
        pathCore(root, res, curr, sum);
        
        return res;
        
    }
    private void pathCore(TreeNode root, List<List<Integer>> res, List<Integer> curr, int sum) {
        if (root != null) {
            if (sum - root.val == 0 && root.left == null && root.right == null) {
                curr.add(root.val);
                res.add(new ArrayList<>(curr));
                curr.remove(curr.size() - 1);
                return;
            }
            
            curr.add(root.val);
            pathCore(root.left, res, curr, sum - root.val);
            pathCore(root.right, res, curr, sum - root.val);
            curr.remove(curr.size() - 1);
        }
    }
}