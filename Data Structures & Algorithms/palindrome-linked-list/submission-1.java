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
    /* Bruteforce Using Stack */
    public boolean isPalindrome(ListNode head) {
        
        /* Add all the element into stack */
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while(temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        /* Pop one by one element from stack and verify the match */
        temp = head;
        while(temp != null) {
            if(temp.val != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }
        
        return true;
    }
}