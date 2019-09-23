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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        
        LinkedList<TreeNode> list = new LinkedList<>();
        boolean leftToRight = true;
        list.add(root);
        
        while (!list.isEmpty()) {
            LinkedList<Integer> elem = new LinkedList<>();
            int size = list.size();
            if (leftToRight) {
                for (int i = 0; i < size; i++) {
                    TreeNode curr = list.remove(0);
                    elem.add(curr.val);
                    if (curr.left != null) list.add(curr.left);
                    if (curr.right != null) list.add(curr.right);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    TreeNode curr = list.remove(list.size() - 1);
                    elem.add(curr.val);
                    if (curr.right != null) list.add(0, curr.right);
                    if (curr.left != null) list.add(0, curr.left);
                }
            }
            result.add(elem);
            leftToRight = !leftToRight;
        
        }
        return result;
    }
}