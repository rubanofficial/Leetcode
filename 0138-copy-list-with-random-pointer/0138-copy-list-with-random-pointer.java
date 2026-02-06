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
        Node curr = head;
        HashMap <Node,Node> res = new HashMap<>();
        Node newhead = null;
        Node newcurr = null;
        while(curr != null){
            Node newnode = new Node(curr.val);
            if(newhead == null){
                newhead = newnode;
                newcurr = newnode;
            }
            else{
                newcurr.next = newnode;
                newcurr = newcurr.next;
            }   
            res.put(curr,newnode);
            curr = curr.next;
        }
        curr = head;
        newcurr = newhead;
        while(curr != null){
            Node ran = res.get(curr.random);
            newcurr.random = ran;
            newcurr = newcurr.next;
            curr = curr.next;
        }
        return newhead;
    }
}