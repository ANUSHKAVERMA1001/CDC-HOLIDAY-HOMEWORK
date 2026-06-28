/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
        {
            return false;
        }
        if(head.next==null)
        {
            return true;
        }

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        
        ListNode curr=slow;
        ListNode prev=null;

        while(curr!=null)
        {
            ListNode temp = curr.next; 
            curr.next = prev;          
            prev = curr;               
            curr = temp; 
        }
        
        ListNode head2=head;
        while(head2!=null && prev!=null)
        {
            if(head2.val!=prev.val)
            {
                return false;
            }
            head2=head2.next;
            prev=prev.next;
        }
        return true;
        
    }
}
