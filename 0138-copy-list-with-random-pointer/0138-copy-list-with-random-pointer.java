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
        HashMap<Node,Node> res = new HashMap<>();
        Node dummy = new Node(0);
        Node tail = dummy;
        Node curr = head;
        while(curr != null){
            Node newnode = new Node(curr.val);
            res.put(curr,newnode);
            tail.next = newnode;
            tail = tail.next;
            curr = curr.next;
        }
        
        curr = head;
        while(curr != null){
            Node copy = res.get(curr);
            copy.random = res.get(curr.random);
            curr = curr.next;
        }
        return dummy.next;
    }
}