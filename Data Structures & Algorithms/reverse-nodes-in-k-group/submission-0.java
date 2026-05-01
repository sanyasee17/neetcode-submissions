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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prev = null;
        ListNode next = null;

        while(temp != null) {

            /* Find the kth element */
            ListNode kthElement = findKthElement(temp, k);

            /* If kth element not found */
            if(kthElement == null) {
                if(prev != null) {
                    prev.next = temp;
                }
                break;
            }

            /* Save next element and detach */
            next = kthElement.next;
            kthElement.next = null;
            
            /* Reverse the group */
            reverse(temp);

            /* Link now */
            if(head == temp) {
                head = kthElement;
            } else {
                prev.next = kthElement;
            }

            /* Move ahead both temp and prev */
            prev = temp;
            temp = next;

        }
        return head;
    }

    private ListNode findKthElement(ListNode temp, int k) {

        int count = 1;
        while(temp != null) {
            if(k == count) {
                break;
            }
            count++;
            temp = temp.next;
        }
        return temp;
    }

    private ListNode reverse(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;


        while(temp != null) {

            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;

        }
        return prev;
    }
}
