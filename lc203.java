/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        
        
        ListNode curr = head;
        
        while (curr != null) {
            if (curr.val == val) {
                head = curr.next;
                curr = curr.next;
            } else {
                break;
            }
        }
        
        while (curr != null && curr.next!= null) {
            
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}