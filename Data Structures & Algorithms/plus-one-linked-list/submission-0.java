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
    public ListNode plusOne(ListNode head) {

        /* Reverse the LinkedList */
        head = reverse(head);

        /* Plus in digit and carry if there */
        int carry = 1;
        ListNode temp = head;

        while(temp != null) {

            temp.val = temp.val + carry;

            /* If value is more than 10 we have keep 0 and carry 1,
                else we can save the same and move on */
            
            if(temp.val < 10) {
                carry = 0;
                break;
            } else {
                carry = 1;
                temp.val = 0;
            } 
            temp = temp.next;
        }

        /* Reverse the LinkedList */
        head = reverse(head);

        /* Check if we have a carry means all digits were 9 */
        if(carry == 1) {
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    /* Reverse a linkedlist */
    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode temp = head;

        while(temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
