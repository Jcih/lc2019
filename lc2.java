
// Definition for singly-linked list.
// public class ListNode {
// 	int val;
// 	ListNode next;
// 	ListNode(int x) { val = x;}
//  }



class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        int carry = 0;
        
        
        while ( l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
            	sum += l1.val;
            	l1 = l1.next;
            }
            if (l2 != null) {
            	sum += l2.val;
            	l2 = l2.next;
            }

            int nodeValue = (sum + carry) % 10;
            carry = (sum + carry) / 10;
            
            
            ListNode newNode = new ListNode(nodeValue);

            current.next = newNode;
            current = current.next;
        }

        if (carry != 0) {
        	ListNode newNode1 = new ListNode(carry);
        	current.next = newNode1;
        }
        
        return dummy.next;
    }
}