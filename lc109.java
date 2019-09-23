/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return BSTRecursive(head, null);
    }
    
    public TreeNode BSTRecursive(ListNode head, ListNode tail) {
        if (head == tail) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        TreeNode thead = new TreeNode(slow.val);
        thead.left = BSTRecursive(head, slow);
        thead.right = BSTRecursive(slow.next, tail);
        return thead;
    }
}