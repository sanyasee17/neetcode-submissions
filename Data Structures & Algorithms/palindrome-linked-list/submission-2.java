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
    /* Optimise */
    public boolean isPalindrome(ListNode head) {
        
        /* Edge Case - Empty or Single Element */
        if(head == null || head.next == null) {
            return true;
        }

        /* Find the mid postion */
        ListNode slow = head;
        ListNode fast = head;

        /* We have to do extrac check for odd case. 
            Think where will be first when slow is at mid */
        while(fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHead = reverse(slow.next);
        
        /* Lets compare now */
        ListNode first = head;
        ListNode second = secondHead;

        while(second != null) {
            if(first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        /* Revert back the LL to original state */
        reverse(secondHead);
        return true;
    }

    /* Reverse a LL */
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