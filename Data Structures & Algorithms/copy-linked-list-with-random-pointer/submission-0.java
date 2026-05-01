/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        /* Create a Map to store new Node and Original Node (Original, Copy) */
        Map<Node, Node> map = new HashMap<>();

        Node temp = head;

        while(temp != null) {
            Node newCopyNode = new Node(temp.val);
            map.put(temp, newCopyNode);

            temp = temp.next;
        }
        
        /* Link all the new copy nodes by checking original */
        temp = head;
        while(temp != null) {

            Node copy = map.get(temp);

            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);

    }
}
